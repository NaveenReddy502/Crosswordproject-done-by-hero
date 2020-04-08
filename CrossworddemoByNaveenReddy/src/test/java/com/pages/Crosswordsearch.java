package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Crosswordsearch {
Logger LOG = Logger.getLogger(CrosswordLoginPage.class.getName());
	
	WebDriver driver;
	By search = By.id("search-input");
	By searchbutton = By.xpath("/html/body/div[2]/div[1]/div/div/div/div[2]/nav/div[4]/div/form/span[3]/input");
	
	
	public Crosswordsearch (WebDriver driver) {
		this.driver = driver;
		}
	
		 
		//enter required product name in the search bar
		 public void Home_search()
			{
				driver.findElement(search).sendKeys("Urban Naxals");
				driver.findElement(search).click();
				LOG.info("entered product Name in the search bar");
			}
		 
		 // click on the search button
		/* public void homepage_login() {

				driver.findElement(searchbutton).click();
				LOG.info("clicked search button"); 
		 }*/
	
	
}
