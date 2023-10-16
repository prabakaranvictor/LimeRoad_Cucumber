package com.pom;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Product_Choose extends Base_Class implements Product_Choose_Interface{
	
	public Product_Choose() {
		
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id=Women_category_id)
	private WebElement Women_category;
	
	@FindBy(xpath=Filp_Flops_xpath)
	private WebElement Filp_Flops;
	
	@FindBy(css =WomenToeSlipper_CSS)
	private WebElement WomenToeSlipper;
	
	public WebElement getWomen_category() {
	return Women_category;
	}

	public WebElement getFilp_Flops() {
	return Filp_Flops;
	}

	public WebElement getWomenToeSlipper() {
	return WomenToeSlipper;
	}

}
