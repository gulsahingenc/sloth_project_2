package com.cydeo.step_definition;

import com.cydeo.utilities.Driver;
import io.cucumber.java.AfterAll;


public class Hooks {

   @AfterAll
    public static void tearDown(){
       Driver.closeDriver();
   }
}
