package com.Stepdefinition;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.CrosswordLoginPage;
import com.seleniumutility.Utility;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrossWordStepLogin extends Library {

	
	CrosswordLoginPage login;
	
	Utility util;

@Given("^I launch Chrome browser$")
public void i_launch_Chrome_browser() throws IOException {
	launchApp();
    System.out.println("Crossword home page opened");
    
}

@When("^Login Crossword login page opened$")
public void login_Crossword_login_page_opened() throws IOException {
	login =new CrosswordLoginPage(driver);
	login.homepage_login();
    System.out.println("crossword login page opened");
}

@Then("^enter \"([^\"]*)\" and \"([^\"]*)\"")
public void i_enter_username_and_password(String email, String password)
{
	login =new CrosswordLoginPage(driver);
	
	login.loginToApp_username(email);
	login.loginToApp_password(password);
	
}

@Then("^clicks the login button$")
public void clicks_the_login_button() throws IOException {
	login =new CrosswordLoginPage(driver);
	login.loginToApp_Loginbtn();
	System.out.println("login done");
}
	@Then("^takes a screenshot$")
	public void takes_a_screenshot() throws IOException  {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\ProjectDoneByHero\\src\\test\\resources\\Screenshot\\Crosswordloginpage.png");
		System.out.println("screenshot taken");
	    
	}
/*@Given("^Close the browser$")
public void close_the_browser() {
driver.quit();

System.out.println("browser exit sucessfully");
}*/
	  
    
}





















	
	/*@Given("^clicks on My Account$")
	public void clicks_on_My_Account() throws IOException {
	    abc = new CrosswordMyaccount(driver);
	    abc.amyaccount();
	    System.out.println("my account opened");
	}

	@Then("^clicks on Update Profile$")
	public void clicks_on_Update_Profile() throws IOException {
	    abc = new CrosswordMyaccount(driver);
	    abc.aupdate();
	    System.out.println("update profile opened");
	}*/
	
	/*@Then("^takes a screenshot$")
	public void takesscreenshot() throws IOException  {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\ProjectDoneByHero\\src\\test\\resources\\Screenshot\\Crosswordmyaccount.png");
		
	    
	}*/
	



