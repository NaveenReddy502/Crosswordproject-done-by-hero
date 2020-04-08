package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrossWordGifts {
Logger LOG = Logger.getLogger(CrosswordLoginPage.class.getName());
	
	WebDriver driver;
	
	By Gifts = By.xpath("/html/body/div[2]/div[1]/div/div/div/div[2]/nav/div[2]/ul/li[5]/a");
	By Books = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/ul/li[2]/h5[1]/a");
	
	public CrossWordGifts (WebDriver driver) {
		this.driver = driver;
		}
	// Enter into Gifts page 
		 public void homepage_Gifts() {

				driver.findElement(Gifts).click();
				LOG.info("clicked Gifts button"); 
		
		 }
		 
			// select books page
				 public void homepage_Books() {

						driver.findElement(Books).click();
						LOG.info("clicked Books button"); 
				
				 }
		 
		 
		 
		 }
	

