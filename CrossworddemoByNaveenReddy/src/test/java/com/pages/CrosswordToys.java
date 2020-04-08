package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrosswordToys {

Logger LOG = Logger.getLogger(CrosswordLoginPage.class.getName());
	
	WebDriver driver;
	
	By Toys = By.xpath("/html/body/div[2]/div[1]/div/div/div/div[2]/nav/div[2]/ul/li[4]/a");
	By Toysgames = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/div[2]/ul/li[2]/div[3]/div[1]/ul/li[2]/a");
	
	

public CrosswordToys (WebDriver driver) {
	this.driver = driver;
	}
// enter into Toys page
	 public void homepage_Toys() {

			driver.findElement(Toys).click();
			LOG.info("clicked toys page"); 
	
	 }
	 
		// Select toys and games link
			 public void homepage_Toysgames() {

					driver.findElement(Toysgames).click();
					LOG.info("Select toys and games link"); 
			
			 }
	 
	 
	 
	 }