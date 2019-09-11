package com.atmecs.travelphp.testscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.atmecs.travelphp.testsuite.TestBase;
import com.atmecs.travelphp.utils.PhpTravelsProperties;

public class BookingPage extends SelectPage{
	@Test(priority=3)
	public void booking() throws IOException, InterruptedException {
		PhpTravelsProperties phpprop=new PhpTravelsProperties();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(phpprop.readBookingPagePropertiesFile("bookingpage.country.btn"))).click();
	    driver.findElement(By.linkText("INR")).click();
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("bookingpage.priceorder.btn"))).click();
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("bookingpage.rating.btn"))).click();
	Thread.sleep(3000);
	JavascriptExecutor scroll = (JavascriptExecutor) driver;
	scroll.executeScript("window.scrollBy(0,250)");
	Thread.sleep(3000);
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("bookingpage.details.btn"))).click();
    scroll.executeScript("window.scrollTo(0,800)");
    Thread.sleep(3000);
    driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("bookingpage.booknow.btn"))).click();
	
	
	}
}

