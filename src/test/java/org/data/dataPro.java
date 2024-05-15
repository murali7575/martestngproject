package org.data;

import org.base.baseClass;
import org.openqa.selenium.WebElement;
import org.page.BookHotelPage;
import org.page.LoginPageClass;
import org.page.SearchHotelPage;
import org.page.WelcomePageClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataPro {
	
	public static baseClass b = new baseClass();
	public static LoginPageClass l;
	public static SearchHotelPage s;
	public static WelcomePageClass w;
	public static BookHotelPage h; 
	
	@DataProvider(name="loginData")
	public Object[][] getData(){
		
		
		return new Object[][] {
			{"monik", "monik"},
			{"monik12345","monik12345"},
			{"hellow","heloow"}
					
		};	
	}
	
	@Test(dataProvider="loginData")
	private void test1(String user , String pass) {
		
		try {
			b.getDriver();
			b.getUrl("https://adactinhotelapp.com/");
			b.winMax();
			
			l = new LoginPageClass();
			WebElement userName = l.getUserName();
			b.textSendByJava(userName, user);

			WebElement passWord = l.getPassWord();
			b.textSendByJava(passWord, pass);

			WebElement loginButton = l.getLoginButton();
			loginButton.click();
			
			
			s = new SearchHotelPage();

			WebElement location = s.getLocation();
			b.selectByValue(location, "Melbourne");

			WebElement hotel = s.getHotel();
			b.selectByValue(hotel, "Hotel Sunshine");

			WebElement roomType = s.getRoomType();
			b.selectByValue(roomType, "Super Deluxe");

			WebElement numberOfRoom = s.getNumberOfRoom();
			b.selectByValue(numberOfRoom, "6");

			WebElement adultPerRoom = s.getAdultPerRoom();
			b.selectByValue(adultPerRoom, "1");

			WebElement cPerRoom = s.getCPerRoom();
			b.selectByValue(cPerRoom, "0");

			WebElement searchButton = s.getSearchButton();
			searchButton.click();
			
			
			w = new WelcomePageClass();

			WebElement getradioBut = w.getradioBut();
			getradioBut.click();

			WebElement getconBut = w.getconBut();
			getconBut.click();
			
			
			h = new BookHotelPage();

			WebElement firstName = h.getFirstName();
			b.textSendByJava(firstName, "murali");

			WebElement lastName = h.getLastName();
			b.textSendByJava(lastName, "kishan");

			WebElement billAdd = h.getBillAdd();
			b.textSendByJava(billAdd, "chennai");

			WebElement cno = h.getCno();
			b.textSendByJava(cno, "1234567890123456");

			WebElement cType = h.getCType();
			b.selectByValue(cType, "VISA");

			WebElement selectMon = h.getSelectMon();
			b.selectByValue(selectMon, "8");

			WebElement selectYear = h.getSelectYear();
			b.selectByValue(selectYear, "2025");

			WebElement cvvNo = h.getCvvNo();
			b.textSendByJava(cvvNo, "999");

			WebElement bookNow = h.getBookNow();
			bookNow.click();
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

	
	

}