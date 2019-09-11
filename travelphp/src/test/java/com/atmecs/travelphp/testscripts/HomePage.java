package com.atmecs.travelphp.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.travelphp.testsuite.PhpPageActions;
import com.atmecs.travelphp.testsuite.TestBase;
import com.atmecs.travelphp.utils.PhpTravelsProperties;

public class HomePage extends TestBase{
	@Test(priority=1)
	public void home() throws InterruptedException, IOException {
	PhpTravelsProperties phpprop=new PhpTravelsProperties();
	Thread.sleep(3000);
	PhpPageActions.sendKeys(phpprop.readHomrPagePropertiesFile("homepage.username.txt"), " user@phptravels.com");
    PhpPageActions.sendKeys(phpprop.readHomrPagePropertiesFile("homepage.password.txt"), "demouser");
    PhpPageActions.clickOnElement(phpprop.readHomrPagePropertiesFile("homepage.login.btn"));
    }
}
