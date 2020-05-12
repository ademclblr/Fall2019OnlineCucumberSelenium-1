package com.vytrack.days.day3;

public class JSONreport {         //mvn clean verify -q (this eliminate step run quitely)    or mvn test
    /*
    //our framework creates json file, some plugin takes jason file and generates a nice HTML report
//We add json plugin => "json:target/cucumber.json" => to let it generate by our framework

//it is a 3rd party reporting plugin, not officially develeoped by cucumber. add plugin  into pom.xml.
           also make sure you haev mave-surefire, and maven-failsafe
JSON: contains only properties, objects and collections. there is no method.  most used for API.

JSON: nativly supported by javascript, because it derives from it.
It is a plain text
Most popular one is Maven Cucumber HTML Report. we just need to add this to pom.xml fle as plugin
We also need to add mave-surefire plugin, to exe our tests with maven command
     */
}
