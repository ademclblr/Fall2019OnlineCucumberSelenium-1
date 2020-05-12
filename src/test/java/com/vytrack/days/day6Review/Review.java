package com.vytrack.days.day6Review;

public class Review {
    /*
    Gherkin language- is used to write BDD scenarios.

    Keywords:Given, When, Then, and, But

    Examples

    Test data: is stored  in feature file. We user parameters, data table, examples table to store test data in
                feature file. Who creates? yourself.
                If u are only automation tester, all test case are written by manuel tester and give u all test steps
                 and test data

     BackGround: to reduce number of same steps. If all scenarios is some feature file have common beginning steps.
                we put together under background

      Where is ur object repository: if u say page object respository it means page object package. You mean page object repository

      Scenario: 1 test case, or 1 test, or test method in TestNG

      Locators: can be stored in page classes, in interface

      Scenario Outline vs Scenario:  Scenario: runs only one,  Scenario Outline: runs as many times as rows of test
                        data  in examples table.
      Scenario Oulines:  used for data driven testing. When we have 2 or more scenarios wirh exactly same steps but
                        different inputs
                   must followed Example tables
                   data is stored in between pipes |value|,  first is table heads

       Parameters: we use them to make steps resuable:
                    When use logs as "driver"---> in " " is parameter to step definations
                    Parameter  can be string, integer, floats

       Data tables: used to expand test steps and fit more test data into one step, we can 1 or mre colum
                    1 colum --List<E>
                    2++ colums--Map<E,E>, List <Map<E,E>

        Tags: to run test sc. and ignore others etc.
                @Tag and @Tag2 - run only scenarios have both of them
                @Tag or @Tag2 - run scen. have  either one has @Tag or @Tag2
                @Tag or not @Tag2= run with  @tag that are not marked with @tag2

                --@tag and (@tag2 or @tag3)

         What kind of tags do u have?
                module name
                jira issue tag (bug or story)
                smoke test -- scen. that relates to smoke test

         Hooks class- methods are running before and after test scen.
                @Before hook- to prepare environment for test
                @After hook - to clean up envir. after test screenshots

                We can have couple of hooks marked with some tag
                ex:  @Before ("@scpecial")   // 2 tags
                  public void befrehook(){
                 }

         Runner class: used to kick off cucumber test scen.
                    --it must know where are the test steps
                    -- .... there feature file
                @CucumberOptions
                     glue = "com/vytrack/step_definitions",
                 features = "src/test/resources/features",
                 dryRun =false,   //gets unimpelemented steps when TRUE, check every test steps are impelemted
                                  //false: ru
                  strict=false,    // true: to mark unimpelemted stesp as error
                 tags = "@create_car_ddt"
                 plugin={"html:target/default-report",   // generate cucumber html report
                "json:target/cucumber2.json"}   // to generate json report.




       Cucumber review:
       -tags
       -background
       -data table
       -scenario









     */
}
