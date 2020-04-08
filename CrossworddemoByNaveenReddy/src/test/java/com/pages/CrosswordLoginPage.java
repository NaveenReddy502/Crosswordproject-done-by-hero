package com.pages;




import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CrosswordLoginPage // using configlogin
{
	Logger LOG = Logger.getLogger(CrosswordLoginPage.class.getName());
	
	WebDriver driver;
	By loginbutton = By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[2]");
	By email = By.id("user_session_email");
	By password = By.id("user_session_password");
	By login = By.id("user_session_submit");
	
	
	public CrosswordLoginPage (WebDriver driver) {
		this.driver = driver;
		}
	// enter homepage login
		 public void homepage_login() {

				driver.findElement(loginbutton).click();
				LOG.info("clicked login button"); 
		 }
		//enter username of the user
		 public void loginToApp_username(String userid)
			{
				driver.findElement(email).sendKeys(userid);	
				LOG.info("entered Name in the username field");
			}
		//enter password of the user
		 public void loginToApp_password(String pass)
			{
				driver.findElement(password).sendKeys(pass);
				LOG.info("entered password in the password field");
			}
			
		//click on login button
			public void loginToApp_Loginbtn()
			{
			
				driver.findElement(login).click();
				LOG.info("clicked login button");
			}
		}
	
	