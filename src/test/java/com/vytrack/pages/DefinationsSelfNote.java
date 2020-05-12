package com.vytrack.pages;

public class DefinationsSelfNote {
    /*
    Step_definations: all codes go here
 /*
    Java- to write a code
    Intellij- where we write a code
    Maven- project builder tool
    Selenium Webdriver-tool for automating web based applications
    TestNg- unit testing (mostly) and E2E testing framework
    Selenium: BDT (Behavior Driven Testing), TDD (Test Driven Development),

               TDD (Test Driven Development)- targeting lowest level of testing, it is targeting unit testing ex: method, small codes, mostly developers
                                      "write piece of code and validate test pass or fails"
                                      Developers writing code before writing functionalities, this is TDD
                                      On backgroud it assert negative and positive part to validate  to pass or fail
                                      result is Higher quality

              BDD (Behavior Driven Testing)-Entire team is being involved, writing AC (as a user I should ...) and Scenarios (calc app is open, I added 2 and 2  then cal should display 4)
                                        Write AC (based on user story), write BDD Scenarios,
                                        Based on the user story they develop code as we test it. Whole team is involved into discussion
                                        Discussing about clarification.

              TDD and BDT both about development and automated testing. Both cases tests will be written before dev.process
              TDD= dealing with raw code
              BDT/BBD= it is about testing the functionality from end-user perspective, we are not dealing with raw codes.

              BDD= it is about UI point of view.,

              Three Amigos: BA(providing req.documents) +DEV+Tester

              Feature File (extension is feature):Used to store BDD test scenarios. Without Feature file it is plain text

              BDD advantage: String Collaboration,  Documentation, Feature file is requirement and test scenario. Plain text easy to understand.

              What tools we gonna use?: to automate BDD in our test, we need cucumber (0pen sources) cucumber.io

              tdd, developers writes tests than develop application to pass those tests. bdd using same language with client,
              developer and tester. To make communication better.

              We have to have "Gherkin" and "Cucumver for java" plugins
     */
    /*
    BDD: it is methodlogy Is used to write requirement documents from end user perspective.
            so, BA, PO dev team devs and testers can sit together and discuss requirements that are written in plain text

     BDD: helpsto fill the gap between Business and tech teams
            every story starts like: As user, I want to able to.....

            As testers, develop test automation scripts based on user story AC
     */


    /*
    Right click on feature file and new file --> *.feature ( file setting plugins then add gherkins and Cucumber for Java then
                                                                     editor type  file types  then choose cucumber add *.feature. then restart)
     */

    /*
    STEPS:
    1.read analyze US, I f needed ask questions during grooming
    2. write feature file/files with test scenarios
    3. Dry run- to generate step defination
    4. place step def.medthods into step def. classes
    5. Allocate all req. web elements and develop req. methods for interaction with those elements
    6. Create page objects in the test step def. classes and use them to provide code implementation for every test step.
    7. When everything is done, generate HTML report and push the code to github, from your branch, and
        create a pull request for code review
    8. When review is completed you can moe your task from in progress/review to DONE in JIRA

    How do you implement BDD in test automatio? We use cucumber BDD.

       for test cases, we create .feature files. Every feature file consists of test scenarios. every test scenarios consists
         of test steps. Every test step has to start with "gherkin" keywords
    Given, when, then, and, But

    Also feature has description :
        Feature: Create a car
                As a user, I want to be able to add new car
        Scenarios: 1. Add some car
                Given user is

    There are manily framework:
     pages ---- page classes
     runners---- cucumber test runners, we need to execute feature file
     step_definations  -- simple java class where we keep code implementation of test steps   : cucumber links steps def with test steps in feature file
     utilities
     feature

        (Dry true: to generate unimplemented  step defs before real test exe.)
        ( strict = true-- enforce step def implementation)

 @driver ignore rest of the scenarioes and run only 1 of them use tags a below, cucumbe will run onlt @driver ones

  In runner class put tags = "@driver"  // it means it will only run @driver scenario in feature file

strict: - ture: to marh unimplemented step defs as error

@known_issue

     */


}
