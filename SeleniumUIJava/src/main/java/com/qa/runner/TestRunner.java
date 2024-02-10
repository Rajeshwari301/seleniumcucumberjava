package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/rajeshwarimahadevan/eclipse-workspace/SeleniumUIJava/src/main/java/com/qa/features/login.feature", //the path of the feature files
		glue={"com/qa/stepdefinition"},//the path of the step definition files
		format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = false, //it will check if any step is not defined in step definition file
		dryRun = false
		//to check the mapping is proper between feature file and step def file
			//		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)
 
public class TestRunner {
 
}


