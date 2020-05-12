package com.vytrack.days.Review2;

public class ParallelTesting {
    /*
    Cucumber supports parallel testing by default.All happens thru maven-surefire plugin & maven-failsafe plugin
                Currently we use maven-surefire plugin (should be one of them)

                There are 2 options how parallel running is done:
                --runner classes  (example below, 2 means 2 runner class)
                --feature file


          ThreadLocal class and sycnorized keyword  (1 thread open 1 browser, 5 thread 5 browser,)
          1 thread =1 test= 1 opened browser
          By increasing number of threads u can finish test exe. faster, But if u have 2 runner  classes,
          u can run ore than 2 tests at the same time  (run with mvn test, mvn verify, mvn install)

          Singleton Desing: nobody call call Webdriver, ony Driver.get() method

         They have to take different feature file to run parallel test

                    <parallel>classes</parallel> method or classes
                    <threadCount>2</threadCount>  // how many runner classes
                    <perCoreThreadCount>false</perCoreThreadCount>
                    <forkCount>2C</forkCount>
                    <includes>

   U can aslo make it Unlimited Thread, and remove the tag, so it will run every feature (it is regression) file parallel,
            it will open 1 browser for each
            <!-- for parallel running Cucumber-->
                    <parallel>methods</parallel>
                    <useUnlimitedThreads>true</useUnlimitedThreads>
                    <includes>

            Check POM.xml ,


     */

}
