package com.priceline.runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = "src/test/resources/features/Demo001.feature",
        glue = "com/priceline/testSteps/"
)

public class Demo001Test {
	
	/*
	 * Demo Test To get page title
	 * Arafat Mamun
	 * 8-11-2016 13:44
	 */

	
}
