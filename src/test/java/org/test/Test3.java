package org.test;

import org.base.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.page.BookHotelPage;
import org.page.LoginPageClass;
import org.page.SearchHotelPage;
import org.page.WelcomePageClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 extends baseClass {
	public static baseClass b = new baseClass();
	public static LoginPageClass l;
	public static SearchHotelPage s;
	public static WelcomePageClass w;
	public static BookHotelPage h;

	@Test
	public void browserLaunch() {
		try {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();



			b.getUrl("https://adactinhotelapp.com/");
			b.winMax();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = "browserLaunch")
	public void loginLaunch() {

		try {
			l = new LoginPageClass();
			WebElement userName = l.getUserName();
			b.textSendByJava(userName, "monik12345");

			WebElement passWord = l.getPassWord();
			b.textSendByJava(passWord, "monik12345");

			WebElement loginButton = l.getLoginButton();
			loginButton.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = "loginLaunch")
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

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Test(dependsOnMethods = "enteringCredentialInScearchHotelPage")
	public void conformationHotel() {
		try {
			w = new WelcomePageClass();

			WebElement getradioBut = w.getradioBut();
			getradioBut.click();

			WebElement getconBut = w.getconBut();
			getconBut.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = "conformationHotel")
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
			
			driver.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
