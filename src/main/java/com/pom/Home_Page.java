	package com.pom;
	
	
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;
	
	public class Home_Page extends Base_Class implements HomePage_Interface {
		
		public Home_Page() {
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath= shopwomenclick_Xpath)
		private WebElement shopwomenclick;
	
		
	    public WebElement getShopwomenclick() {
		return shopwomenclick;
		}
		
}