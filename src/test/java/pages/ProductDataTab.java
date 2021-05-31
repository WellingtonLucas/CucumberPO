package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.Utils;

public class ProductDataTab {

	private WebDriver driver;
	private Utils utils;
	private By txt_start_date;
	private By slct_insurance_sum;
	private By slct_merit_rating;
	private By slct_damage_insurance;
	private By radio_euro_product;
	private By radio_defense_product;
	private By slct_courtesy_car;
	private By btn_next;

	public ProductDataTab(WebDriver driver) {
		this.driver = driver;
		utils = new Utils(driver);
	}

	public void setStartDateAs(String date) {
		if (utils.existsElement("startdate")) {
			txt_start_date = By.id("startdate");
			driver.findElement(txt_start_date).sendKeys(date);
		}
	}

	public void selectInsuranceSumAs(String sum) {
		if (utils.existsElement("insurancesum")) {
			slct_insurance_sum = By.id("insurancesum");
			Select selectInsurance = new Select(driver.findElement(slct_insurance_sum));
			selectInsurance.selectByValue(sum);
		}
	}

	public void selectMeritRatingAs(String rating) {
		if (utils.existsElement("meritrating")) {
			slct_merit_rating = By.id("meritrating");
			Select selectMerit = new Select(driver.findElement(slct_merit_rating));
			selectMerit.selectByValue(rating);
		}
	}

	public void selectDamageInsuranceAs(String insurance) {
		if (utils.existsElement("damageinsurance")) {
			slct_damage_insurance = By.id("damageinsurance");
			Select selectDamage = new Select(driver.findElement(slct_damage_insurance));
			selectDamage.selectByValue(insurance);
		}
	}

	public void setOptionalProductsAs(String euro, String defense) {
		if (utils.existsElement("EuroProtection") && utils.existsElement("LegalDefenseInsurance")) {
			radio_euro_product = By.id("EuroProtection");
			radio_defense_product = By.id("LegalDefenseInsurance");
			Actions action = new Actions(driver);
			if (euro != null && euro.equals("Euro Protection"))
				action.moveToElement(driver.findElement(radio_euro_product)).click().perform();
			if (euro != null && defense.equals("Legal Defense Insurance"))
				action.moveToElement(driver.findElement(radio_defense_product)).click().perform();
		}
	}

	public void selectCoutesyCarAs(String courtesy) {
		if (utils.existsElement("courtesycar")) {
			slct_courtesy_car = By.id("courtesycar");
			Select selectCoutesy = new Select(driver.findElement(slct_courtesy_car));
			selectCoutesy.selectByValue(courtesy);
		}
	}

	public void clicksTheNextButton() {
		if (utils.existsElement("nextselectpriceoption")) {
			btn_next = By.id("nextselectpriceoption");
			driver.findElement(btn_next).sendKeys(Keys.ENTER);
		}
	}

}
