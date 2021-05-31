package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import utils.Utils;

public class SendQuoteTab {
	private WebDriver driver;
	private Utils utils;
	private By txt_email;
	private By txt_phone;
	private By txt_username;
	private By txt_pass;
	private By txt_confirm_pass;
	private By txt_comments;
	private By btn_send;

	public SendQuoteTab(WebDriver driver) {
		this.driver = driver;
		utils = new Utils(driver);
	}

	public void setEmailAs(String email) {
		try {
			if (utils.existsElement("email")) {
				txt_email = By.id("email");
				driver.findElement(txt_email).sendKeys(email);
			}
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
	}

	public void setPhoneAs(String phone) {
		try {
			if (utils.existsElement("phone")) {
				txt_phone = By.id("phone");
				driver.findElement(txt_phone).sendKeys(phone);
			}
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
	}

	public void setUsernameAs(String name) {
		try {
			if (utils.existsElement("username")) {
				txt_username = By.id("username");
				driver.findElement(txt_username).sendKeys(name);
			}
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
	}

	public void setPasswordAs(String pass) {
		try {
			if (utils.existsElement("password")) {
				txt_pass = By.id("password");
				driver.findElement(txt_pass).sendKeys(pass);
			}
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
	}

	public void setConfirmPassword(String pass) {
		try {
			if (utils.existsElement("confirmpassword")) {
				txt_confirm_pass = By.id("confirmpassword");
				driver.findElement(txt_confirm_pass).sendKeys(pass);
			}
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
	}

	public void setComments(String comment) {
		try {
			if (utils.existsElement("Comments")) {
				txt_comments = By.id("Comments");
				driver.findElement(txt_comments).sendKeys(comment);
			}
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
	}

	public void clicksTheNextButton() {
		try {
			if (utils.existsElement("sendemail")) {
				btn_send = By.id("sendemail");
				driver.findElement(btn_send).sendKeys(Keys.ENTER);
			}
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
	}

	public void verifySuccessMessage() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		try {
			By message = By.xpath(".//div[@class='sweet-alert showSweetAlert visible']/h2");
			Assert.assertEquals("Sending e-mail success!", driver.findElement(message).getText());
		} catch (NoSuchElementException noSuchElementException) {
			Assert.fail("Elemento não encontrado.");
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}

	}

	public void clicksOnOKButton() {
		try {
			By btn_ok = By.className("confirm");
			driver.findElement(btn_ok).sendKeys(Keys.ENTER);
		} catch (NoSuchElementException noSuchElementException) {
			Assert.fail("Elemento não encontrado.");
		} catch (ElementNotInteractableException elementNotInteractableException) {
			Assert.fail("Elemento não encontrado.");
		}
		driver.quit();
	}

}
