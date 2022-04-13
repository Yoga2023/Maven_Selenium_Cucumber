package com.testrun;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClass.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\java\\com\\feature\\Adactin_Cucu.feature",
		glue ="com.stepDefinition",
	monochrome = true,
		//dryRun = false,
		publish=true,
		tags =("~@Ad6"),
		plugin = {"html:Cucumber_Reports/Report.html",
				"json:Reports/Jsonreport.json",
				//"pretty",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"com.cucumber.listener.ExtentCucumberFormatter:Report/Ext.html"
	
		}
		
		
		)

public class Test_Runner {
public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		driver =Base_Class.browser("chrome");
	}

		@AfterClass
		public static void tear_Down() {
			Base_Class.close();
		}
		
	}

