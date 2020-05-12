package com.vytrack.days.JENKINS;

public class CI_CD {
    /*
You push everything to github -> jenkins take the code from github like intellij, it compiles the code on server and creates executible file - do the build process.
Server - computer that is used to serve other computers. Server runs 7/24 - stronger than computer.
Jenkins : Takes the code from github & creates build & deploys to environments and at the end deploys to production environment.

Note: When new build is deployed to environments, smoke test should automatically executed

Daily: smoke test is running on test environment, If something happened, we can not do our workm eveyrbody should
        be aware of. that is why we run smoke test after new build (because new changes could broke something), and
        because something could happened overnight that caused server problems.

Pipeline: production pipeline: set of process: Version control --> test enviornment __> staging envir__>
            if something happened jenkins send report

Jenkins: make sure that all build are pass otherwise it will return to coding env. never pass to tester envi.
  Contious Delivery is: After Staging environment: this is done manually.

    CI/CD= contious Integdation and Continous Deployment/Delivery
    SonarQube: that checks/scans the quality of code ( codes of developers) and gives report,
                about what is wrong about the bug.

  VersionControl  build  code  unitTest  IntegrationTest  TestEnvironent Smoke  regression Performance deploy stagingEnviroment (UAT testing)
    Jenkin takes codes from Github, and install it in server and compiles it. ()
    Server: computer that is used to serve other computers.
    aws: cloud system. then u have private vpn, so nobody can access it.

     */
}
