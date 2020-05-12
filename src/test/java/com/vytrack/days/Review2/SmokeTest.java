package com.vytrack.days.Review2;

public class SmokeTest {
    /*
      Sanity test is lightweight verion of Smoke test
    How do we create a smoke test?
      Smoke test file called SmokeTest.feature __>> this is how is done in my project.
       or you can use some scenarios by using tag @smoke_test.  so you can group it

       Hw many test cases? 30, it takes about 15 min, all components in it. @5 AM. who fix? devops. developer fix the code
         if something wrong, whole team recive email notification with report.
         Devops: person who build code and also responsible for operations with code deployment.

       How it should be triggered? from CI/CD (Jenkins (open sourse, free): contious integration) .
       Some companies using Bamboo instead of Jenkins. (automatically exe. ur test)
       Periodically - evry morning, every hour
       Smoke test must be triggered automctically without human intervention.

       After deployment there should be smoke test. new build was deployed to test environment.
       500 error means something on server

       For vytrack: we can use scenario outline for smoke test

       from terminal you can use this to run

       mvn clean verify _Dcucumber.options="--tags @smoke_test" -q
       mvn clean verify -Dcucumber.options=“--tags @smoke_test”

           Dcucumber.options= override cucumber options specified in runner
           ----------tags @smoke_test" = means run only test scenarios with this tag
           -q  = it is optional, to quit the exe.

           ---mvn clean test -P Smoke   to run smoke testhing also.
           --- mvn slean verify -X  , this is bugging

        Note: In particular profile like POM.xml file u can create plugins for smoke testing like we did in class



     */
}
