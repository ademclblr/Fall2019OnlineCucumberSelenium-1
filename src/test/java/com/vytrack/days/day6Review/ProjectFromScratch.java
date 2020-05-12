package com.vytrack.days.day6Review;

public class ProjectFromScratch {
    /*
    feature file: right click on test and create directory
    1. create mave project
         project name: CucumberWebOrdersFall2019
         gorup id:     com.weborders
         artifact id:  CucumberWebOrdersFall2019

     2. add dependencies,
        -maven complier dependency
        - cucumber io JVM
        -cucumber Junit
        -Webdriver manager
        -selenium
        -SLF4J-- prints info to console
        etc...

     3.create .gitignore  (add ore if needed)
            .idea
             *.iml
              target
             .DS_Store
              test-output

      4. create packages:
            right click on src--> test--> java
             create a package: com.weborders

            pages: - for page classes
            runners- cucumber test runners classes
            step_definations- to keep step def methods, that are used for code imple.of tests scenrarios.
            utilities: reasuble code

            right click on src -> test-> new directory - resources/features
            under feature, we keep all feature files
            under resources, we keep all test data along with feature file

      5. create configuration.properties files
            browser=chrome
            url=http://secure.smartbearsoftware.com/samples/testcomplete12/weborders
            username=Tester
            password=test

          we use properties file to store some project config info ex:
             ex: URLS for UI, API and Data Base
                 credentials, API end points,
          Selenium Grid Configuration --> info about servers and how to connect to them

      6. Utilities:
            browser.
            date time
            api
            dat base
            pdf files
            excel file  etc....

      7. Runner class

      8.  LoginStepsDefinations class under step_def package

      9. Create ur first featre file called login. Feature under Resources-->

      10. Perform dryrun  and  and paste generated steps

      11. Create pagebase class
            --initialize page factory
            --allocate all common locators and store them here,

      12. Create LoginPage class and allocate all required by previously created test cases web element and
               store them under corresponding page classes, in case u need more than just login page

      13. Create  page object of LoginPage in LoginStepDef. class to be able to iteract with page and test case

       14. add hooks class:
            @before  maximize windows ,  @after take screenshoot and close driver

       15. create a git repository and commit code to github
        git init, git add .  git, git commit -m "first commet"

        Go to github create a repository with corresponding project name







     */
}
