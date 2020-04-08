package com.Stepdefinition;

import com.baseclass.Library;
import com.pages.CrossWordGifts;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrossWordStepGifts extends Library {

	CrossWordGifts gift;
	Utility util;

	@Given("^I lanuch crome$")
	public void i_lanuch_crome() throws Throwable {
		launchApp();
	    System.out.println("Crossword home page opened");
	    
	}

	@Then("^clicks Gifts$")
	public void clicks_Gifts() throws Throwable {
	    gift = new CrossWordGifts(driver);
	    gift.homepage_Gifts();
	    System.out.println("Gifts page opened");
	}

	@Then("^clicks on Books$")
	public void clicks_on_Books() throws Throwable {
	    gift= new CrossWordGifts(driver);
	    gift.homepage_Books();
	    System.out.println("Books opened");
	}

	@Then("^takes a picture$")
	public void takes_a_picture() throws Throwable {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\ProjectDoneByHero\\src\\test\\resources\\Screenshot\\CrosswordGifts.png");
		System.out.println("screenshot taken");
	}

	
	
}
