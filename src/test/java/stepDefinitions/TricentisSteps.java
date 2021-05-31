package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InsurantDataTab;
import pages.PriceOptionTab;
import pages.ProductDataTab;
import pages.SendQuoteTab;
import pages.VehicleDataTab;

public class TricentisSteps {
	private WebDriver driver;
	private VehicleDataTab vehicleDataTab;
	private InsurantDataTab insurantDataTab;
	private ProductDataTab productDataTab;
	private PriceOptionTab priceOptionTab;
	private SendQuoteTab sendQuoteTab;

	@Given("Browser is open")
	public void browser_is_open() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@Given("user is on Vehicle Insurance Application")
	public void user_is_on_enter_vehicle_data_tab() {
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
	}
	
	/**
	 * Here we start to use a page object to Enter Vehicle Data tab 
	 * @author Wellington Lucas Moura
	 * 
	 **/
	@When("user select make as {string}")
	public void user_select_make_as(String make) {
		vehicleDataTab = new VehicleDataTab(driver);
		vehicleDataTab.selectMakeAs(make);
	}

	@When("user select model as {string}")
	public void user_select_model_as(String model) {
		vehicleDataTab.selectModelAs(model);
	}

	@When("user set cylinder capacity as {string}")
	public void user_set_cylinder_capacity_as(String capacity) {
		vehicleDataTab.setCylinderCapacityAs(capacity);
	}

	@When("user set engine performance as {string}")
	public void user_set_engine_performance_as(String performance) {
		vehicleDataTab.setEnginePerformanceAs(performance);
	}

	@When("user set manufacturing date as {string}")
	public void user_set_manufacturing_date_as(String date) {
		vehicleDataTab.setManufacturingDateAs(date);
	}

	@When("user select number of seats as {string}")
	public void user_select_number_of_seats_as(String number) {
		vehicleDataTab.selectNumberOfSeatsAs(number);
	}

	@When("user set right hand drive as {string}")
	public void user_set_right_hand_drive_as(String hand) {
		vehicleDataTab.setRightHandDriveAs(hand);
	}

	@When("user select number of seats again as {string}")
	public void user_select_number_of_seats_again_as(String seat) {
		vehicleDataTab.selectNumberOfSeatsAgainAs(seat);
	}

	@When("user select fuel type as {string}")
	public void user_select_fuel_type_as(String type) {
		vehicleDataTab.selectFuelTypeAs(type);
	}

	@When("user set payload as {string}")
	public void user_set_payload_as(String payload) {
		vehicleDataTab.setPayloadAs(payload);
	}

	@When("user set total weight as {string}")
	public void user_set_total_weight_as(String total) {
		vehicleDataTab.setTotalWeightAs(total);
	}

	@When("user set list price as {string}")
	public void user_set_list_price_as(String price) {
		vehicleDataTab.setListPriceAs(price);
	}

	@When("user set licence plate number as {string}")
	public void user_set_licence_plate_number_as(String number) {
		vehicleDataTab.setLicencePlateNumberAs(number);
	}

	@When("user set annual mileage as {string}")
	public void user_set_annual_mileage_as(String mileage) {
		vehicleDataTab.setAnnualMileageAs(mileage);
	}

	@When("user clicks the next button to insurant data")
	public void user_clicks_the_next_button() {
		vehicleDataTab.clickNextButton();
	}

	/**
	 * Here we start to use a page object to Enter Insurant Data tab 
	 * @author Wellington Lucas Moura
	 * 
	 **/
	@When("user set first name as {string}")
	public void user_set_first_name_as(String string) {
		insurantDataTab = new InsurantDataTab(driver);
		insurantDataTab.setFirstNameAs(string);
	}

	@When("user set last name as {string}")
	public void user_set_last_name_as(String string) {
		insurantDataTab.setLastNameAs(string);
	}

	@When("user set date of birth as {string}")
	public void user_set_date_of_birth_as(String string) {
		insurantDataTab.setDateOfBirthAs(string);
	}

	@When("user set gender as {string}")
	public void user_set_gender_as(String string) {
		insurantDataTab.setGenderAs(string);
	}

	@When("user set street address as {string}")
	public void user_set_street_address_as(String string) {
		insurantDataTab.setStreetAddressAs(string);
	}

	@When("user select country as {string}")
	public void user_select_country_as(String string) {
		insurantDataTab.selectCountryAs(string);
	}

	@When("user set zip code as {string}")
	public void user_set_zip_code_as(String string) {
		insurantDataTab.setZipCodeAs(string);
	}

	@When("user set city as {string}")
	public void user_set_city_as(String string) {
		insurantDataTab.setCityAs(string);
	}

	@When("user select occupation as {string}")
	public void user_select_occupation_as(String string) {
		insurantDataTab.selectOccupationAs(string);
	}

	@When("user set hobbies as other")
	public void user_set_hobbies_as_other() {
		insurantDataTab.setHobbiesAsOther();
	}

	@When("user set website as {string}")
	public void user_set_website_as(String string) {
		insurantDataTab.setWebsiteAs(string);
	}

	@When("user clicks the next button to product data")
	public void user_clicks_the_next_button_to_product_data() {
		insurantDataTab.clicksTheNextButton();
	}
	
	/**
	 * Here we start to use a page object to Enter Product Data tab 
	 * @author Wellington Lucas Moura
	 * 
	 **/
	@When("user set start date as {string}")
	public void user_set_start_date_as(String date) {
		productDataTab = new ProductDataTab(driver);
		productDataTab.setStartDateAs(date);
	}

	@When("user select insurance sum as {string}")
	public void user_select_insurance_sum_as(String sum) {
		productDataTab.selectInsuranceSumAs(sum);
	}

	@When("user select merit rating as {string}")
	public void user_select_merit_rating_as(String rating) {
		productDataTab.selectMeritRatingAs(rating);
	}

	@When("user select damage insurance as {string}")
	public void user_select_damage_insurance_as(String insurance) {
		productDataTab.selectDamageInsuranceAs(insurance);
	}

	@When("user set optional products as {string} and {string}")
	public void user_set_optional_products_as_and(String euro, String defense) {
		productDataTab.setOptionalProductsAs(euro, defense);
	}

	@When("user select courtesy car as {string}")
	public void user_select_courtesy_car_as(String courtesy) {
		productDataTab.selectCoutesyCarAs(courtesy);
	}

	@When("user clicks the next button to price option")
	public void user_clicks_the_next_button_to_price_option() {
		productDataTab.clicksTheNextButton();
	}
	
	/**
	 * Here we start to use a page object to Select Price Option tab 
	 * @author Wellington Lucas Moura
	 * 
	 **/
	@When("user set price option as {string}")
	public void user_set_price_option_as(String price) {
		priceOptionTab = new PriceOptionTab(driver);
		priceOptionTab.setPriceOptionAs(price);
	}

	@When("user clicks the next button to send quote")
	public void user_clicks_the_next_button_to_send_quote() {
		priceOptionTab.clicksTheNextButton();
	}
	
	/**
	 * Here we start to use a page object to Send Quote tab 
	 * @author Wellington Lucas Moura
	 * 
	 **/
	@When("user set email as {string}")
	public void user_set_email_as(String email) {
		sendQuoteTab = new SendQuoteTab(driver);
		sendQuoteTab.setEmailAs(email);
	}

	@When("user set phone as {string}")
	public void user_set_phone_as(String phone) {
		sendQuoteTab.setPhoneAs(phone);
	}

	@When("user set username as {string}")
	public void user_set_username_as(String name) {
		sendQuoteTab.setUsernameAs(name);
	}

	@When("user set password as {string}")
	public void user_set_password_as(String pass) {
		sendQuoteTab.setPasswordAs(pass);
	}

	@When("user set confirm password {string}")
	public void user_set_confirm_password(String pass) {
		sendQuoteTab.setConfirmPassword(pass);
	}

	@When("user set comments {string}")
	public void user_set_comments(String comment) {
		sendQuoteTab.setComments(comment);
	}

	@When("user clicks the next button to send email")
	public void user_clicks_the_next_button_to_send_email() {
		sendQuoteTab.clicksTheNextButton();
	}

	@Then("user verify success message")
	public void user_verify_success_message() {
		sendQuoteTab.verifySuccessMessage();
	}

	@Then("user clicks on OK button")
	public void user_clicks_on_OK_button() {
		sendQuoteTab.clicksOnOKButton();
	}
}
