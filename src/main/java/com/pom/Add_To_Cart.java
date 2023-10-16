package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Add_To_Cart extends Base_Class implements Add_To_Cart_Interface {
	
	public Add_To_Cart() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=Select_Size_xpath)
	private WebElement Select_Size;

	@FindBy(xpath=Add_To_Cart_btn_Xpath)
	private WebElement Add_To_Cart_btn;

	public WebElement getSelect_Size() {
	return Select_Size;
		}
	
	public WebElement getAdd_To_Cart_btn() {
	return Add_To_Cart_btn;
	
	}
}
