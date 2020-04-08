package com.Stepdefinition;

import com.baseclass.Library;
import com.pages.CrosswordMyaccountinfo;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrosswordStepMyaccount extends Library {
 
	CrosswordMyaccountinfo abc;
	Utility util;
	

@Given("^I launch$")
public void i_launch() throws Throwable {
	launchApp();
    System.out.println("Crossword home page opened");
}

@Then("^Login page$")
public void login_page() throws Throwable {
	abc= new CrosswordMyaccountinfo(driver);
	abc.homepage_login();
}

@Then("^enter User and pass$")
public void enter_User_and_pass() throws Throwable {
	abc= new CrosswordMyaccountinfo(driver);
	abc.loginToApp_username();
	abc.loginToApp_password();
}

@Then("^clicks logbu$")
public void clicks_logbu() throws Throwable {
	abc= new CrosswordMyaccountinfo(driver);
	abc.loginToApp_Loginbtn();
}

@Then("^clicks Myacc$")
public void clicks_Myacc() throws Throwable {
	abc= new CrosswordMyaccountinfo(driver);
	abc.amyaccount();
}

@Then("^clicks update pro$")
public void clicks_update_pro() throws Throwable {
	abc= new CrosswordMyaccountinfo(driver);
	abc.aupdate();
}

@Then("^clicks shoot a pic$")
public void clicks_shoot_a_pic() throws Throwable {
	util = new Utility(driver);
	util.takeSnapShot("D:\\naveenreddy\\ProjectDoneByHero\\src\\test\\resources\\Screenshot\\CrosswordMyaccount.png");
	
}


	
	
	
	
	
	
	
	
}
