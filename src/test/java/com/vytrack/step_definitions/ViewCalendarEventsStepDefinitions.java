package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ViewCalendarEventsStepDefinitions {
    CalendarEventsPage calendarEventsPage=new CalendarEventsPage();

    @Then("View Per Page menu should have following options")
    public void view_Per_Page_menu_should_have_following_options(List<String> dataTable) {  // it was io.cucumber.datatable.DataTable then we changed, you can
        System.out.println("expected values: "+dataTable);
        Assert.assertEquals(dataTable,calendarEventsPage.getViewPerPageOptions());
    }
}
