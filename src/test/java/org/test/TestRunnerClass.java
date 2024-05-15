package org.test;

import org.base.baseClass;
import org.data.dataPro;
import org.openqa.selenium.WebElement;
import org.page.BookHotelPage;
import org.page.LoginPageClass;
import org.page.SearchHotelPage;
import org.page.WelcomePageClass;

import org.testng.annotations.Test;

public class TestRunnerClass extends baseClass {

	public static baseClass b = new baseClass();
	public static LoginPageClass l;
	public static SearchHotelPage s;
	public static WelcomePageClass w;
	public static BookHotelPage h; 
	
	
   
	@Test(priority=1)
	public void browserLaunch() {
		try {
			b.getDriver();
			b.getUrl("https://adactinhotelapp.com/");
			b.winMax();
			
			System.out.println("1");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
   
	@Test(dataProvider="loginData",dataProviderClass=dataPro.class,priority=2)
	public void loginLaunch() {

		try {
			l = new LoginPageClass();
			WebElement userName = l.getUserName();
			b.textSendByJava(userName, "user");

			WebElement passWord = l.getPassWord();
			b.textSendByJava(passWord, "pass");

			WebElement loginButton = l.getLoginButton();
			loginButton.click();
			System.out.println("2");
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority=3)
	public void enteringCredentialInScearchHotelPage() {
		try {

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
			System.out.println("3");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Test(priority=4)
	public void conformationHotel() {
		try {
			w = new WelcomePageClass();

			WebElement getradioBut = w.getradioBut();
			getradioBut.click();

			WebElement getconBut = w.getconBut();
			getconBut.click();
			System.out.println("4");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority=5)
	public void paymentDetails() {
		try {
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
			
			
			System.out.println("5");
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

	}

