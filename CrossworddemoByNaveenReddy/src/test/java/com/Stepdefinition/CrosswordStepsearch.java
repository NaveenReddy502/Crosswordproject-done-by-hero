package com.Stepdefinition;

import com.baseclass.Library;
import com.pages.Crosswordsearch;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrosswordStepsearch extends Library {

Crosswordsearch log;
	
	Utility util;
	
	
	@Given("^I lanuch$")
	public void i_lanuch() throws Throwable {
		launchApp();
	    System.out.println("Crossword home page opened");
	    
	}

	@Then("^enter the product name in searchbar$")
	public void enter_the_product_name_in_searchbar() throws Throwable {
	    log = new Crosswordsearch(driver);
	    log.Home_search();
	    System.out.println("Product name entered in search bar");
	}

	/*@Then("^clicks search button$")
	public void clicks_search_button() throws Throwable {
	    log = new Crosswordsearch(driver);
	    log.homepage_login();
	}*/

	@Then("^shoot picture$")
	public void shoot_picture() throws Throwable {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\ProjectDoneByHero\\src\\test\\resources\\Screenshot\\CrosswordSearchresult.png");
		System.out.println("photo taken ");
	}

	@Then("^close the browser$")
		public void close_the_browser() {
			driver.quit();

			System.out.println("browser exit sucessfully");
	}

	
	
	
	
	
	
}
