package org.test;

import org.base.baseClass;
import org.data.dataPro;
import org.openqa.selenium.WebElement;
import org.page.BookHotelPage;
import org.page.LoginPageClass;
import org.page.SearchHotelPage;
import org.page.WelcomePageClass;
import org.testng.annotations.Test;


public class Test2 extends baseClass {

	public static baseClass b = new baseClass();
	public static LoginPageClass l;
	public static SearchHotelPage s;
	public static WelcomePageClass w;
	public static BookHotelPage h;

	@Test(dataProvider="loginData",dataProviderClass=dataPro.class)
	public static void browserLaunch(String user , String pass) {
		
		try {
			System.out.println(user  +    pass);
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}