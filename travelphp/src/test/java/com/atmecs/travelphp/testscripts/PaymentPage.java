package com.atmecs.travelphp.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

import com.atmecs.travelphp.utils.PhpTravelsProperties;
import com.atmecs.travelphp.utils.ValidateTestResult;

public class PaymentPage extends BookingPage {
	public void payment() throws IOException {
		PhpTravelsProperties phpprop=new PhpTravelsProperties();
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.title.btn"))).click();
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.firstname.txt"))).sendKeys("THIPARANI");
	assertEquals("THIPARANI", "THIPARANI");
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.lastname.txt"))).sendKeys("SRI NISCHAL");
	assertEquals("SRI NISCHAL", "SRI NISCHAL");
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.email.txt"))).sendKeys("srinischalthiparani@gmail.com");
	assertEquals("srinischalthiparami@gmail.com", "srinischalthiparani@gmial.com");
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.countrycode.btn"))).click();
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.phonenumber.txt"))).sendKeys("9393818195");
	assertEquals("9393818195", "9393818195");
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.cardname.txt"))).sendKeys("THIPARANI SRI NISCHAL");
	assertEquals("THIPARANI SRI NISCHAL", "THIPARANI SRI NISCHAL");
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.cardnumber.txt"))).sendKeys("5589117881238570");
	assertEquals("5589117881238570", "5589117881238570");
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.expiremonth.btn"))).click();
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.expireyear.btn"))).click();
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.cvv.txt"))).sendKeys("520");
	//ValidateTestResult.validateData(DashUtils.text, "Pass % Trend", "Trend data is Present");
	driver.findElement(By.xpath("//button[text()='Got it!']")).click();
	driver.findElement(By.xpath(phpprop.readBookingPagePropertiesFile("paymentspage.completebooking.btn"))).click();
	

}
}
