package org.page;

import org.base.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends baseClass{
	
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//select[@id='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='hotels']")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='room_type']")
	private WebElement roomType;

	public WebElement getRoomType() {
		return roomType;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='room_nos']")
	private WebElement numberOfRoom;

	public WebElement getNumberOfRoom() {
		return numberOfRoom;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='adult_room']")
	private WebElement adultPerRoom;

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='child_room']")
	private WebElement childPerRoom;

	public WebElement getCPerRoom() {
		return childPerRoom;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='Submit']")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}


}
