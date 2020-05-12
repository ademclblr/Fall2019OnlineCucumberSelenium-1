package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // coming from Junit (alternative to TestNG), test configuration
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun =false,   //gets unimpelemented steps when TRUE
        strict=false,
        tags = "@scenario_outline1" , // no tags or tags=" "  is same   //@login tag on top of feature means running all of them.
        plugin={"html:target/default-report",   // generate cucumber html report
                "json:target/cucumber2.json",
                "rerun:target/rerun.txt" // rerun failed test, it(this plugin) will generate list of failed test scenarios at the end of the test exe.

        }  // json report come from java, commenly used in API
                //our file generate json file and some plugin takes json file and convert it to HTML report
        //Most popular one is Maven Cucumber HTML Report. we just need to add this to pom.xml fle as plugin

        //NOTE: you have to verify at maven to get detailed reports //overview report
        //screenshoot goes under hook file

        //to generate report, we need to run verify maven goal
        //maven --> life cycle --> verify
        //Also clean before runnig test
        //  clean target folder

        // it means it will only run "@driver" scenario in feature file
        //if you put "not @ driver", you will exclude this and run rest

        //tags ="@sales_manager or @driver" will run both of them
        //tags = "@sales_manager and @driver" will run if i scenario has 2 tags
        //@known _issue   or tags=" not @known_issue" it will work only if u previously labled scenarios that were reported as a bug

        //we keep below 2 in step def.pascake
        //@Before hook- runs automatically BEFORE every test scenarios  (code to setup conection, maximize windows....
        //@After hook -runs automatically AFTER every test scenarios(code to close connectios, close browser)
)
// in TARGET file we have, jar file, surefire, xml report

class CucumberRunner {


}
