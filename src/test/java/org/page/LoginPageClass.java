package org.page;

import org.base.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass extends baseClass {
	

	public  LoginPageClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement passWord;
	
	public WebElement getPassWord() {
		return passWord;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='login']")
	private WebElement  loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	

}
