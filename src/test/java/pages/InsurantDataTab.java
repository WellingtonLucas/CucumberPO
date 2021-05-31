package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.Utils;

public class InsurantDataTab {
	private WebDriver driver;
	private Utils utils;
	private By txt_first_name;
	private By txt_last_name;
	private By txt_birthdate;
	private By radio_male;
	private By radio_female;
	private By txt_street;
	private By slct_country;
	private By txt_zip_code;
	private By txt_city;
	private By slct_occupation;
	private By check_hobbie_other;
	private By txt_website;
	private By btn_next;

	public InsurantDataTab(WebDriver driver) {
		this.driver = driver;
		utils = new Utils(driver);
	}

	public void setFirstNameAs(String firstName) {
		if (utils.existsElement("firstname")) {
			txt_first_name = By.id("firstname");
			driver.findElement(txt_first_name).sendKeys(firstName);
		}
	}

	public void setLastNameAs(String lastName) {
		if (utils.existsElement("lastname")) {
			txt_last_name = By.id("lastname");
			driver.findElement(txt_last_name).sendKeys(lastName);
		}
	}

	public void setDateOfBirthAs(String birthdate) {
		if (utils.existsElement("birthdate")) {
			txt_birthdate = By.id("birthdate");
			driver.findElement(txt_birthdate).sendKeys(birthdate);
		}
	}

	public void setGenderAs(String gender) {
		if (utils.existsElement("gendermale") && utils.existsElement("genderfemale")) {
			radio_male = By.id("gendermale");
			radio_female = By.id("genderfemale");
			Actions action = new Actions(driver);
			if (gender.equals("Male"))
				action.moveToElement(driver.findElement(radio_male)).click().perform();
			else if (gender.equals("Female"))
				action.moveToElement(driver.findElement(radio_female)).click().perform();
		}

	}

	public void setStreetAddressAs(String street) {
		if (utils.existsElement("streetaddress")) {
			txt_street = By.id("streetaddress");
			driver.findElement(txt_street).sendKeys(street);
		}
	}

	public void selectCountryAs(String country) {
		if (utils.existsElement("country")) {
			slct_country = By.id("country");
			Select selectCountryt = new Select(driver.findElement(slct_country));
			selectCountryt.selectByValue(country);
		}
	}

	public void setZipCodeAs(String zipCode) {
		if (utils.existsElement("zipcode")) {
			txt_zip_code = By.id("zipcode");
			driver.findElement(txt_zip_code).sendKeys(zipCode);
		}
	}

	public void setCityAs(String city) {
		if (utils.existsElement("city")) {
			txt_city = By.id("city");
			driver.findElement(txt_city).sendKeys(city);
		}
	}

	public void selectOccupationAs(String occupation) {
		if (utils.existsElement("occupation")) {
			slct_occupation = By.id("occupation");
			Select selectOccupation = new Select(driver.findElement(slct_occupation));
			selectOccupation.selectByValue(occupation);
		}
	}

	public void setHobbiesAsOther() {
		if (utils.existsElement("other")) {
			check_hobbie_other = By.id("other");
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(check_hobbie_other)).click().perform();
		}
	}

	public void setWebsiteAs(String website) {
		if (utils.existsElement("website")) {
			txt_website = By.id("website");
			driver.findElement(txt_website).sendKeys(website);
		}
	}

	public void clicksTheNextButton() {
		if (utils.existsElement("nextenterproductdata")) {
			btn_next = By.id("nextenterproductdata");
			driver.findElement(btn_next).sendKeys(Keys.ENTER);
		}
	}

}
