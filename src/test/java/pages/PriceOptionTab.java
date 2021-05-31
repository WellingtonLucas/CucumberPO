package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utils.Utils;

public class PriceOptionTab {
	private WebDriver driver;
	private Actions action;
	private Utils utils;
	private By radio_silver;
	private By radio_gold;
	private By radio_platinum;
	private By radio_ultimate;
	private By btn_next;

	public PriceOptionTab(WebDriver driver) {
		this.driver = driver;
		utils = new Utils(driver);
	}

	public void setPriceOptionAs(String priceOption) {
		try {
			if (utils.existsElement("selectsilver") && utils.existsElement("selectgold")
					&& utils.existsElement("selectplatinum") && utils.existsElement("selectultimate")) {

				radio_silver = By.id("selectsilver");
				radio_gold = By.id("selectgold");
				radio_platinum = By.id("selectplatinum");
				radio_ultimate = By.id("selectultimate");
				action = new Actions(driver);

				if (priceOption.equals("Silver"))
					action.moveToElement(driver.findElement(radio_silver)).click().perform();
				else if (priceOption.equals("Gold"))
					action.moveToElement(driver.findElement(radio_gold)).click().perform();
				else if (priceOption.equals("Platinum"))
					action.moveToElement(driver.findElement(radio_platinum)).click().perform();
				else if (priceOption.equals("Ultimate"))
					action.moveToElement(driver.findElement(radio_ultimate)).click().perform();
			}
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
	}

	public void clicksTheNextButton() {
		try {
			if (utils.existsElement("nextsendquote")) {
				btn_next = By.id("nextsendquote");
				driver.findElement(btn_next).sendKeys(Keys.ENTER);
			}
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
	}

}
