package com.vytrack.days.day3;
/*
Background: Common steps for all scenarios in one particular feature file. Similar to @Before, hook
Example below: "Given user is on the login page" is same for all scenarios. only works for 1st step// u reduce number of steps

  Background: open login page                 //this step will execute before all scenarios
       Given user is on the login page

  Sequneces:  Before hook---> Background steps --> After hook
  Background: can take as many steps as u need, only work in feature file,

  If hook applies on all feature files, background will be applied only for the feature file.
   # 1st repeated step goes into backgroud, less codes on Scenarioes
   Bckground is keywoard comes from Gherkin.


@sales_manager
  Scenario: Login as sales manager and verify that title is Dashboard
    Given user is on the login page
    When user logs in as a sales manager
    Then user should verify that title is a Dashboard

  @store_manager
  Scenario: Login as store manager and verify that title is Dashboard
    Given user is on the login page
    When user logs in as a store manager
    Then user should verify that title is a Dashboard

    # ignore rest of the scenarioes and run only 1 of them use tags a below, cucumber will run onlt @driver ones
  @driver @dashboard
    Scenario: Login as driver and verify that title is Dashboard
      Given user is on the login page
      When user logs in as a driver
      Then user should verify that title is a Dashboard
 */
public class Background {
}
