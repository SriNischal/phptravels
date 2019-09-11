package com.atmecs.travelphp.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.travelphp.constants.ProjectBaseConstantPaths;



public class TestBase {
	   protected static WebDriver driver;
	
		@BeforeTest

		public void setBrowser() {
			
			  System.setProperty("webdriver.chrome.driver",ProjectBaseConstantPaths.CHROME_FILE);
			  driver = new ChromeDriver(); driver.manage().window().maximize();
			  
			
			
	driver.get(" https://www.phptravels.net/account/");
		}

	

}
