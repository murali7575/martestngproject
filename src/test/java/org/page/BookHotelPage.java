package org.page;

import org.base.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends baseClass{
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='first_name']")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='last_name']")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(how = How.XPATH, using = "//textarea[@id='address']")
	private WebElement billAdd;

	public WebElement getBillAdd() {
		return billAdd;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='cc_num']")
	private WebElement Cno;

	public WebElement getCno() {
		return Cno;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='cc_type']")
	private WebElement CType;

	public WebElement getCType() {
		return CType;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='cc_exp_month']")
	private WebElement selectMon;

	public WebElement getSelectMon() {
		return selectMon;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='cc_exp_year']")
	private WebElement selectYear;

	public WebElement getSelectYear() {
		return selectYear;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='cc_cvv']")
	private WebElement CvvNo;

	public WebElement getCvvNo() {
		return CvvNo;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='book_now']")
	private WebElement bookNow;

	public WebElement getBookNow() {
		return bookNow;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='order_no']")
	private WebElement oderNo;

	public WebElement getOderNo() {
		return oderNo;
	}


}
