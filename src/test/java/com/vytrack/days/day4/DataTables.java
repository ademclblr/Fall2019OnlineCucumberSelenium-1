package com.vytrack.days.day4;

public class DataTables {
    /*
    Data table: it is used to extend test steps.
            When user logs in as "driver" | value in double quote is parameter

                feature file                           step defination
            When user logs in as "driver" -----> @when (user logs in as{string})
                                                public void user_logs_is_as (String string){
                                                ---tun this phrase into action
        NOTE: all parameter in " " becomes String

        Ex: Then user creates a new car with "testplates" car plates and "black" color "toyota" make, "camry" model
        @Then (user creates a new car with {string} car plates and {string} color {string} make, {string} model)
        public void user_creates_a_new_......................(String string, String string, String string.......)
        These above steps look ugly disorganized so we use DATA TABLE

        DATA TABLE example:

        |car_plates|testplates|
        |color|black|
        |make|toyota|
        |model|camry|

        we can have multiple data tables in one scenario, yes.

        @Then(Then user creates a new car with following info;)
        public void user_creates_a_new_car_with_following_info(DataTable dataTable){
        }
        we can change DataTable to something else, so cucumber will auto..transform it into some data structure
        #AFTER-- we changed DataTable into the MAP


        Given user logs in it folloing credentials:
        |usernme|storemanager|
        |password| UserUser123|
        Then user creates a new car ith following info:
        |car_plates| sdet|
        |color| Red|
        |make|toyota|
        |model| Camry|

        Note: If values modified in scenario, it will affect on step def. Step def. gets data from the scenario.
            or
            |car_plate|color|make    |model|     --> reason is u can add more than 1 for each one
            |sdet     | red | toyota| camry |0
           | driver   |green| pathfi|nissan|1   ctrl+ALT +L (to line up  feature lines)  or go to code --> reformat

           ....(List<Map<String,String>>data)
           data.get(0).get("color")--> red

     */
}
