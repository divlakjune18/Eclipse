package com.vcentry.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (tags = "@validCredentials", 
monochrome = true,
features="D:\\Divya\\BDDScenarioOutlineTest\\src\\test\\resources\\Features\\",
glue = "com.vcentry.automation.stepDefinitions",
plugin = {"pretty", 
		"html:target/CucumberReports.html",
		"json:target/CucumberReports.json",
		"junit:target/CucumberReports.xml"}
)
public class RunnerClass {

	
}
