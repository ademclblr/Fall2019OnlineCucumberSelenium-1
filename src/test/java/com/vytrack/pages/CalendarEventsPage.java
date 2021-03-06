package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtilities;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class CalendarEventsPage extends AbstractPageBase {
    @FindBy(css = "[title='Create Calendar event']")
    private WebElement createCalendarEvent;

    @FindBy(className = "select2-chosen")
    private WebElement owner;

    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_start']")
    private WebElement startDate;

    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_end']")
    private WebElement endDate;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_start']")
    private WebElement startTime;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_end']")
    private WebElement endTime;

    @FindBy(className = "grid-header-cell__label")
    private List<WebElement> columnNames;

    @FindBy(css = "iframe[id^='oro_calendar_event_form_description-uid']")
    private WebElement descriptionFrame;

    @FindBy(css = "[id^='oro_calendar_event_form_title-uid']")
    private WebElement title;

    @FindBy(id = "tinymce")
    private WebElement descriptionTextArea;

    @FindBy(css = "[class='btn-group pull-right'] > button")
    private WebElement saveAndClose;

    @FindBy(xpath = "(//div[@class='control-label'])[1]")
    private WebElement generalInfoTitle;

    @FindBy(xpath = "//label[text()='Description']/following-sibling::div//div")
    private WebElement generalInfoDescription;

    @FindBy (xpath = "//table//tbody//tr[3]//td[9]")
    private WebElement threeDot;

    @FindBy(xpath = "//*[contains(text(),'View per page:')]/following-sibling::*//a")
    private List<WebElement> viewPerPageElements;

    @FindBy(css = "button[class*='btn dropdown-toggle']")
    private WebElement viewPerPageToggle;

    public List<String> getViewPerPageOptions() {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[title='Create Calendar event']")));
        viewPerPageToggle.click();
        BrowserUtilities.wait(5);
        return BrowserUtilities.getTextFromWebElements(viewPerPageElements);
    }

    public void threeDott(){
        BrowserUtilities.wait(4);
        wait.until(ExpectedConditions.visibilityOf(threeDot));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(threeDot);

    }


    public void enterCalendarEventTitle(String titleValue) {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(title)).sendKeys(titleValue);
        wait.until(ExpectedConditions.attributeToBe(title, "value", titleValue));
    }
    public void enterCalendarEventDescription(String description) {
        //wait until frame is available and switch to it
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(descriptionFrame));
        descriptionTextArea.sendKeys(description);
        wait.until(ExpectedConditions.textToBePresentInElement(descriptionTextArea, description));
        driver.switchTo().defaultContent();//exit from the frame
    }

    public void clickOnSaveAndClose() {
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.elementToBeClickable(saveAndClose)).click();
    }

    public String getGeneralInfoTitleText() {
        BrowserUtilities.waitForPageToLoad(20);
        return generalInfoTitle.getText();
    }

    public String getGeneralInfoDescriptionText() {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Description']/following-sibling::div//div")));
        return generalInfoDescription.getText();
    }

//#############################################################


       public List<String> getColumnNames(){
        BrowserUtilities.waitForPageToLoad(20);
        return BrowserUtilities.getTextFromWebElements(columnNames);
    }

    public String getStartTime() {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id^='time_selector_oro_calendar_event_form_start']")));
        wait.until(ExpectedConditions.visibilityOf(startTime));
        return startTime.getAttribute("value");
    }
    public String getEndTime() {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id^='time_selector_oro_calendar_event_form_end']")));
        wait.until(ExpectedConditions.visibilityOf(endTime));
        return endTime.getAttribute("value");

    }
    public String getOwnerName(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("select2-chosen")));
        wait.until(ExpectedConditions.visibilityOf(owner));
        return owner.getText().trim();
    }

    public void clickToCreateCalendarEvent(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[title='Create Calendar event']")));
        wait.until(ExpectedConditions.elementToBeClickable(createCalendarEvent)).click();
        BrowserUtilities.wait(10);
        //BrowserUtils.waitForPageToLoad(20);
    }
    public String getStartDate(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(startDate));
        return startDate.getAttribute("value");
    }
    public String getEndDate(){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(endDate));
        return startDate.getAttribute("value");
    }

    /**
     * This method returns difference between end and start time
     * @param start time
     * @param end time
     * @param format like h:m a
     * @return difference between end time and start time as a long
     */
    public static long getTimeDifference(String start, String end, String format){
        LocalTime startTime = LocalTime.parse(start, DateTimeFormatter.ofPattern(format));
        LocalTime endTime = LocalTime.parse(end, DateTimeFormatter.ofPattern(format));
        return ChronoUnit.HOURS.between(startTime, endTime);
    }

}

