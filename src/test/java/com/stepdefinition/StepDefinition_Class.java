package com.stepdefinition;



import com.Base.Base_Class;
import com.utility.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class StepDefinition_Class extends Base_Class{
	

	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("User launch the URL {string}")
	public void user_launch_the_url(String url) throws InterruptedException {
    urlLaunch(url);
	}

	@When("Usee clicks on shop women")
	public void usee_clicks_on_shop_women() {
	pom.getpom().getShopwomenclick().click();
	}
	@When("User click on women products")
	public void user_click_on_women_products() throws InterruptedException {
	Thread.sleep(3000);
	mouseHover(pom.getpom1().getWomen_category());
	  
	}

	@When("User click on foodwear flipflops")
	public void user_click_on_foodwear_flipflops() throws InterruptedException  {
	Thread.sleep(3000);
	mouseHover(pom.getpom1().getFilp_Flops());
	pom.getpom1().getFilp_Flops().click();
	}
	
	@When("User click on Women Toe Separator Slippers")
	public void user_click_on_women_toe_separator_slippers() throws InterruptedException {
	Thread.sleep(20000);	
	pom.getpom1().getWomenToeSlipper().click();
	   
	}
	@When("User select size")
	public void user_select_size() throws InterruptedException {
	Thread.sleep(2000);	
	pom.getpom2().getSelect_Size().click();
	
	}

	@When("User click on add to cart")
	public void user_click_on_add_to_cart() {
	pom.getpom2().getAdd_To_Cart_btn().click();
	    
	}	
}