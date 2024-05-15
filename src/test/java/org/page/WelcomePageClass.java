package org.page;

import org.base.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageClass extends baseClass {
	
	public WelcomePageClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='radiobutton_0']")
	private WebElement radioBut;

	public WebElement getradioBut() {
		return radioBut;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='continue']")
	private WebElement conBut;

	public WebElement getconBut() {
		return conBut;
	}

	

}
