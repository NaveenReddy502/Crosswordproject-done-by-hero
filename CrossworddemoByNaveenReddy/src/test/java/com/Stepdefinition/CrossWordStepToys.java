package com.Stepdefinition;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.CrosswordToys;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrossWordStepToys extends Library {

	CrosswordToys toy;
	Utility util;
	
	@Given("^I launch Chrme bro$")
	public void i_launch_Chrme_bro() throws Throwable {
		launchApp();
	    System.out.println("Crossword home page opened");
	    
	}
	@Then("^clicks on Toys$")
	public void clicks_on_Toys() throws Throwable {
	    toy = new CrosswordToys(driver);
	    toy.homepage_Toys();
	    System.out.println("entered into toys page");
	}

	@Then("^clicks on Toysgames$")
	public void clicks_on_Toysgames() throws Throwable {
	  toy = new CrosswordToys(driver);
	  toy.homepage_Toysgames();
	  System.out.println("clicked on toys and games link");
	}
	@Then("^takes a screenshot for toys$")
	public void takes_a_screenshot_for_toys() throws Throwable {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\ProjectDoneByHero\\src\\test\\resources\\Screenshot\\CrosswordToys.png");
		System.out.println("screenshot taken ");
	}
	
	
}

