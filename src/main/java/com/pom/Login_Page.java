package com.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Login_Page extends Base_Class implements Login_Page_Interface{

	public Login_Page() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Login_btn_Xpath)
	private WebElement Login_btn;
	

	@FindBy(xpath=Mobile_Number_Xpath)
	private WebElement Mobile_Number;
	
	@FindBy(xpath=Next_btn_Xpath)
	private WebElement Next_btn;
	
	public WebElement getLogin_btn() {
		return Login_btn;
	}

	public WebElement getMobile_Number() {
		return Mobile_Number;
	}

	public WebElement getNext_btn() {
		return Next_btn;
	}
}
	
	

	