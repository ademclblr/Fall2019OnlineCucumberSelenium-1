@login
Feature: Login
  As user, I want to be able to login with username and password
 # Feature is the functionality    We store scenarios here
   # ctrl + left click  will take you step def.
  # 1st repeated step goes into backgroud, this is prec condition
  # you can put * instead of Given, When, and, but, then
  # Parameters: it goes into "", ex below: "storemanager85" new step or if configuration is broken, we put it manually (if something new or not listed in conf.reader)

  Background:  On the login page
    Given user is on the login page

  @sales_manager
  Scenario: Login as sales manager and verify that tile is Dashboard
    When user logs in as a sales manager
    Then user should verify that title is a Dashboard
  @store_manager
  Scenario: Login as store manager and verify that tile is Dashboard
    When user logs in as a store manager
    Then user should verify that title is a Dashboard
  @driver @dashboard
  Scenario: login as driver and verify that title is Dashboard
    When user logs in as a driver
    Then user should verify that title is a Dashboard

  @Login_with_params
    Scenario: Login with parameters
      When user enters "storemanager85" username and "UserUser123" password
      Then  user should verify that title is a Dashboard

  @scenario_outline
  Scenario Outline: User names test for user <name>
    When user enters "<username>" username and "<password>" password
    Then user name should be "<name>"

    Examples: credentials
      | username        | password    | name             |
      | user187         | UserUser123 | Jerel Vandervort |
      | user200         | UserUser123 | Lonzo Leuschke   |
      | storemanager52  | UserUser123 | Roma Medhurst    |
      | storemanager66  | UserUser123 | Carlos Ernser    |
      | salesmanager125 | UserUser123 | Cleveland Heller |
      | salesmanager140 | UserUser123 | Jameson Paucek   |