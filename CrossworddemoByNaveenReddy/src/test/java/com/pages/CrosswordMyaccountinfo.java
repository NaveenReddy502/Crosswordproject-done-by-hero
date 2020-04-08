package com.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CrosswordMyaccountinfo
{
	Logger LOG = Logger.getLogger(CrosswordMyaccountinfo.class.getName());
	
	WebDriver driver;
	By loginbutton = By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[2]");
	By email = By.id("user_session_email");
	By password = By.id("user_session_password");
	By login = By.id("user_session_submit");
	By myaccount = By.("/html/body/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[5]");
	By updateprofile = By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/ul/li[3]/a");
	
	public CrosswordMyaccountinfo (WebDriver driver) {
		this.driver = driver;
		}
	// enter login homepage login
		 public void homepage_login() {

				driver.findElement(loginbutton).click();
				LOG.info("clicked login button"); 
		 }
		 
		//enter username of the user
		 public void loginToApp_username()
			{
				driver.findElement(email).sendKeys("naveenreddybaddipadige019@gmail.com");	
				LOG.info("entered Name in the username field");
			}
		//enter password of the user
		 public void loginToApp_password()
			{
				driver.findElement(password).sendKeys("naveen@406");
				LOG.info("entered password in the password field");
			}
			
		//click on login button
			public void loginToApp_Loginbtn()
			{
			
				driver.findElement(login).click();
				LOG.info("clicked login button");
			}
		 

			 public void amyaccount() {
				 
					driver.findElement(myaccount).click();
					LOG.info("clicked myacc button"); 
			 }
			 
			 public void aupdate() {
					driver.findElement(updateprofile).click();
					LOG.info("clicked update button"); 
			 }
		 
		 
		 
}
