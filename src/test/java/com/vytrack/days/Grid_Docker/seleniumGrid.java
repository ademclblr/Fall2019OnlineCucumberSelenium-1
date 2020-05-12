package com.vytrack.days.Grid_Docker;

public class seleniumGrid {
    /*
    S.Grid: it is a java service. for parallel testing (but parallel testing comes from setup in utulitities, threadLocal)
    S.Grid: tool that multiple test with different browser.
    S.Grid: is just a jar file (java program) without docker
    Selenium Grid: this part of Selenium is used to run tests in different machines simultaneously
    possible to run both firefox and chrome at the same time? No, 1 at a time:((
    There are 2 main elements: hub (entry point, u add url to driver class) and node(chrome, firefox, explorer, safari)
    Grid has only 1 hub: used asa entry point, connection point. central point where u load ur test,
                        supervisor of s.grid network
                    Node: is a worker, execute the test that u loaded on the hub. can connect to different browser.
    2 node means: u can run 2 tests parallel, because u have 2 nodes
    Grid: u can run with linux, windows mac etc....

    With Selenium Grid => Run test on different machine, triggers from intellij or jenkins.
    Browser will not open on computer, will run on another server

      1 node run 1 test at a time
      docker-compose scale chrome=2  it means u have 2 nodes/chrome bworwer, u can run parallel
     */
}
