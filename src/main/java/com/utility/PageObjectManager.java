package com.utility;

import org.openqa.selenium.WebDriver;

import com.pom.Add_To_Cart;
import com.pom.Home_Page;
import com.pom.Product_Choose;

public class PageObjectManager {

	WebDriver driver;
	
	private Home_Page pom;
	private Product_Choose pom1;
	private Add_To_Cart pom2;
	
	public Home_Page getpom() {
		pom = new Home_Page();
		return pom;
		
	}
	
	public Product_Choose getpom1() {
		pom1 = new Product_Choose();
		return pom1;
	}
	
    public Add_To_Cart getpom2() {
    	pom2 = new Add_To_Cart();
    	return pom2;
    }
}
