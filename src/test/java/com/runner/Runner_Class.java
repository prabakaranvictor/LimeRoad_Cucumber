package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMINE\\eclipse-workspace\\SeleniumBasics\\LimeRoad\\src\\test\\java\\com\\feature\\lime.feature",
                  glue="com.stepdefinition",
                  monochrome =true,
                  dryRun = false,
                  strict = true,
                  tags= "@SmokeTest",
                  plugin = {"pretty",
                        		  "json:Resources/lime.json",
                        		   "html:Res/limeroad.html",
                        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  
}
                  )
                           

public class Runner_Class extends Base_Class{
	
	@BeforeClass
	public static void Browser_Launch() throws IOException {
	browserLaunch("Chrome");
	}
	
}	