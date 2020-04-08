package com.TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	//Iam running with cucumber class
	@RunWith(Cucumber.class)

	@CucumberOptions
	(
			features = "src\\test\\resources\\Feature",
					glue = {"com.Stepdefinition"},
			plugin = {"pretty", "html:target\\cucumber-html-report",
					"json:target\\cucumber-json-report",
					"junit:target\\cucumber-junit-report",
					"com.cucumber.listener.ExtentCucumberFormatter:target\\cucmber-extent-report\\Extentreports.html"},
			tags = {"@tc_01_Login, @tc_02_Toys, @tc_03_Gifts, @tc_04_Search"},
					//+ ", @tc_02_Login,"
					//+ " @tc_03_Search, @tc_04_Contactus, "
					//+ "@tc_05_Calender, @tc_6_NextPage"},
			
					monochrome = true		
	) 
	public class CrossWordLoginRunner 
	{
		@AfterClass
		  public static void extendReport()
		{
			Reporter.loadXMLConfig("src\\test\\resources\\Testdata\\extent-config.xml");
		    Reporter.setSystemInfo("user", System.getProperty("user.name"));
		    Reporter.setSystemInfo("os", "Windows");
		    Reporter.setTestRunnerOutput("Sample test runner output message");
		}
	}
	
