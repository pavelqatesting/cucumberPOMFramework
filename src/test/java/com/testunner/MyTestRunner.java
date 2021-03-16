package com.testunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/resource/java/com/features/LoginPage.feature"},
		glue = {"com.stepdefinations", "Apphooks"},
		plugin = {"pretty"
		
		}
		
		)

public class MyTestRunner {
/*
 * ,
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/
 */
	//src/resource/java/com/features/LoginPage.feature
}
