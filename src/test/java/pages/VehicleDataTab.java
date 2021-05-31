package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.Utils;

public class VehicleDataTab {
	private WebDriver driver;
	private Utils utils;
	private By select_make;
	private By select_model;
	private By txt_cylindercapacity;
	private By txt_engineperformance;
	private By txt_dateofmanufacture;
	private By select_numberofseats;
	private By radio_righthanddriveyes;
	private By radio_righthanddriveno;
	private By select_numberofseatsmotorcycle;
	private By select_fuel;
	private By txt_payload;
	private By txt_totalweight;
	private By txt_listprice;
	private By txt_licence;
	private By txt_annualmileage;
	private By btn_nextenterinsurantdata;

	public VehicleDataTab(WebDriver driver) {
		this.driver = driver;
		utils = new Utils(driver);
	}

	public void selectMakeAs(String make) {
		if (utils.existsElement("make")) {
			select_make = By.id("make");
			Select selectMake = new Select(driver.findElement(select_make));
			selectMake.selectByVisibleText(make);
		}
	}

	public void selectModelAs(String model) {
		if (utils.existsElement("model")) {
			select_model = By.id("model");
			Select selectModel = new Select(driver.findElement(select_model));
			selectModel.selectByVisibleText(model);
		}
	}

	public void setCylinderCapacityAs(String capacity) {
		if (utils.existsElement("cylindercapacity")) {
			txt_cylindercapacity = By.id("cylindercapacity");
			driver.findElement(txt_cylindercapacity).sendKeys(capacity);
		}

	}

	public void setEnginePerformanceAs(String performance) {
		if (utils.existsElement("engineperformance")) {
			txt_engineperformance = By.id("engineperformance");
			driver.findElement(txt_engineperformance).sendKeys(performance);
		}
	}

	public void setManufacturingDateAs(String date) {
		if (utils.existsElement("dateofmanufacture")) {
			txt_dateofmanufacture = By.id("dateofmanufacture");
			driver.findElement(txt_dateofmanufacture).sendKeys(date);
		}
	}

	public void selectNumberOfSeatsAs(String number) {
		if (utils.existsElement("numberofseats")) {
			select_numberofseats = By.id("numberofseats");
			Select seat = new Select(driver.findElement(select_numberofseats));
			seat.selectByValue(number);
		}
	}

	public void setRightHandDriveAs(String hand) {
		if (utils.existsElement("righthanddriveyes") && utils.existsElement("righthanddriveno")) {
			radio_righthanddriveyes = By.id("righthanddriveyes");
			radio_righthanddriveno = By.id("righthanddriveno");
			Actions action = new Actions(driver);
			if (hand.equals("Yes"))
				action.moveToElement(driver.findElement(radio_righthanddriveyes)).click().perform();
			else if (hand.equals("No"))
				action.moveToElement(driver.findElement(radio_righthanddriveno)).click().perform();
		}
	}

	public void selectNumberOfSeatsAgainAs(String seat) {
		if (utils.existsElement("numberofseatsmotorcycle")) {
			select_numberofseatsmotorcycle = By.id("numberofseatsmotorcycle");
			Select selectSeat = new Select(driver.findElement(select_numberofseatsmotorcycle));
			selectSeat.selectByValue(seat);
		}
	}

	public void selectFuelTypeAs(String type) {
		if (utils.existsElement("fuel")) {
			select_fuel = By.id("fuel");
			Select selectType = new Select(driver.findElement(select_fuel));
			selectType.selectByValue(type);
		}
	}

	public void setPayloadAs(String payload) {
		if (utils.existsElement("payload")) {
			txt_payload = By.id("payload");
			driver.findElement(txt_payload).sendKeys(payload);
		}
	}

	public void setTotalWeightAs(String total) {
		if (utils.existsElement("totalweight")) {
			txt_totalweight = By.id("totalweight");
			driver.findElement(txt_totalweight).sendKeys(total);
		}
	}

	public void setListPriceAs(String price) {
		if (utils.existsElement("listprice")) {
			txt_listprice = By.id("listprice");
			driver.findElement(txt_listprice).sendKeys(price);
		}
	}

	public void setLicencePlateNumberAs(String number) {
		if (utils.existsElement("licenseplatenumber")) {
			txt_licence = By.id("licenseplatenumber");
			driver.findElement(txt_licence).sendKeys(number);
		}
	}

	public void setAnnualMileageAs(String mileage) {
		if (utils.existsElement("annualmileage")) {
			txt_annualmileage = By.id("annualmileage");
			driver.findElement(txt_annualmileage).sendKeys(mileage);
		}
	}

	public void clickNextButton() {
		if (utils.existsElement("nextenterinsurantdata")) {
			btn_nextenterinsurantdata = By.id("nextenterinsurantdata");
			driver.findElement(btn_nextenterinsurantdata).sendKeys(Keys.ENTER);
		}
	}

}
