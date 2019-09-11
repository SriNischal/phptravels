package com.atmecs.travelphp.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.travelphp.testsuite.PhpPageActions;
import com.atmecs.travelphp.utils.PhpTravelsProperties;

public class SelectPage extends HomePage  {
    @Test(priority=2)
	public void select() throws InterruptedException, IOException {
	PhpTravelsProperties phpprop=new PhpTravelsProperties();
	Thread.sleep(3000);
	PhpPageActions.clickOnElement(phpprop.readSelectPagePropertiesFile("selectpage.hotels.btn"));
	PhpPageActions.clickOnElement(phpprop.readSelectPagePropertiesFile("selectpage.Search.txt"));
	Actions action=new Actions(driver);
	action.sendKeys(Keys.TAB).build().perform();
	action.sendKeys(Keys.TAB).build().perform();
	action.sendKeys(Keys.TAB).build().perform();
	action.sendKeys(Keys.TAB).build().perform();
	action.sendKeys("Hyderabad").build().perform();
	 Thread.sleep(3000);
	action.sendKeys(Keys.ENTER).build().perform();
	PhpPageActions.clickOnElement(phpprop.readSelectPagePropertiesFile("selectpage.Checkin.btn"));
	Thread.sleep(3000);
	PhpPageActions.clickOnElement(phpprop.readSelectPagePropertiesFile("selectpage.Checkin.txt"));
	Thread.sleep(3000);
	//driver.findElement(By.xpath(phpprop.readSelectPagePropertiesFile("selectpage.Checkout.txt"))).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(phpprop.readSelectPagePropertiesFile("selectpage.Checkout.btn"))).click();
    PhpPageActions.clickOnElement(phpprop.readSelectPagePropertiesFile("selectpage.search.btn"));
}
}
