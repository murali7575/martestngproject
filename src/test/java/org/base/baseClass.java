package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public static WebDriver driver;
	public JavascriptExecutor js;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	public void getUrl(String url) {
		driver.get(url);

	}

	public void winMax() {
		driver.manage().window().maximize();
	}

	public void textSendByJava(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public void textSendByJs(WebElement elementRef, String textValue) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + textValue + "')", elementRef);

	}

	public void scrollByJs(WebElement elementRef, String scroll) {

		switch (scroll) {
		case "Down":
			js.executeScript("arguments[0].scrollIntoView(true)", elementRef);
			break;

		case "Up":
			js.executeScript("arguments[0].scrollIntoView(false)", elementRef);
			break;

		default:
			System.out.println("In-Valid Comment");
			break;
		}
	}

	public void actions(WebElement targetElemnt, String whichAction) {

		Actions act = new Actions(driver);

		switch (whichAction) {
		case "Hover":
			act.moveToElement(targetElemnt).build().perform();
			break;

		case "Double":
			act.doubleClick(targetElemnt).build().perform();
			break;

		case "Right":
			act.contextClick(targetElemnt).build().perform();
			break;

		default:
			System.out.println("In-valid_Comment");
			break;
		}
	}

	public String readExcel(int rownum, int cellnum) throws IOException {

		// To Locate the File
		File file = new File("C:\\Users\\monik\\OneDrive\\Desktop\\sample\\adctin.xlsx");

		// To get File as Input Dates to filed
		FileInputStream stream = new FileInputStream(file); // throws FileNotFoundException

		// To Define Workbook type
		Workbook book = new XSSFWorkbook(stream);// throws IOException

		// To get sheet from Workbook
		Sheet sheet = book.getSheet("Sheet1");

		Row row = sheet.getRow(rownum);

		Cell cell = row.getCell(cellnum);

		CellType cellType = cell.getCellType();

		String value = null;

		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();

			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				value = simple.format(dateCellValue);

			} else {

				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				value = valueOf.toString();

			}
			break;

		default:
			System.out.println("In-Valid - Cell-Type");
			break;
		}
		return value;

	}

	public void selectByValue(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void screenCapture(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\monik\\OneDrive\\Desktop\\sample"+ name + ".jpeg");
		FileUtils.copyFile(source, target);

		}


	


}
