package com.vytrack.days.JENKINS;

public class Jenkins {
    /*
    How Jenkins run our project: JENKINS USE MAVEN TO RUN TEST, maven have life cycle,
    All services always be with VPN for security purposes.
    Github and jenkins is not in same place, jenkins use maven to get our project from github, github is data provider.
    Why jenkins:to run the test: Jenkins gets from github, execute mvn command(jenkins use maven to build (run ur project) your project)
                and execute in the browser
    what u mean code will be turned into build? you mean developers create it right? When u click on run button it does all process
                also, in maven there is deploy button, check it.
    AMI: we create server(aws) then get the AMI of cybertek (it means have all, jenkins, api etc) otherwise you have to
            install

    EC2:Elastic Cloud, virtual server, All servers are linux based, note: ubuntu and mac are based on linux
    Build periodically: scheduling time, how often
    Apache POI: for excel files
    poll SCM: monitor the commits

    Regression: never run from laptop, always from server
    * 5 * *    everyday at 5 am, exactly at 5am
    5 * * 1-5 smoke test will be running monday thru Friday 5am
    H 5 * * 1-5  around 5am, if something busy it will wait

    H(1-30) 5 * * 1-5  is from 5to 5:30 only monday to friday

    * 10 * * 1-2  monday thru tuesday at 10 am
    * 17 * * 1-2  monday thru tuesday at 5 pm

    From Bould
    clean test -P Smoke  // we already have profile that is the reason

    clean test -Dcucumber.options="--tags @driver"   // to chooase specific tags

  In login feature there is a @driver @dashborad  together, so put @ driver will be enough

  To make changes, dashbard, your job then configure.

  Steps:
    1.Go to dashboard:  new item  smoke test  freestle
    2. select git as a VCS and insert URL
    3. Build "Invoke Top level maven targets" _>>> clean test -P Smoke  or clean test -Dcucumber.options="--tags @driver"
    4. Build process  cucumber reports
    4.

How does jenkins run our project ?
we have maven in our project
How jenkins use maven to run our tests ?
Jenkins -> manage jenkins -> Global tool configuration

Github and jenkins is not in same place, jenkins use maven to get our project from github, github is data provider.
Jenkins use maven to build code and run test, uses java, uses git to pull project from github.
Same thing about intellij, uses maven, jdk(references-java compiler) , uses java.
Intellij-Jenkins run code in same way.
Difference between Jenkins - Intellij :
in intellij we write code, (IDE -integrated development environment)
In jenkins we don’t write code
Common thing between Jenkins and Intellij :
Running code,
requiring java & maven
Things that Jenkins do intellij can not :
jenkins can be configured
we can schedule our test
we can create job(project to be executed)
build trigger => when your test will be executed, after some commit arrive to github, jenkins continiously listen github.

Build -> developersdo for application & testersdo for automation script.
Jenkins is independent from IDE but requires JDK, Java environment to execute project.
Jenkins supports other languages too
Overall Jenkins is build automation tool.
Continious integration - delivery - deployment tool.
CI => between developer & Jenkins


     */
}
