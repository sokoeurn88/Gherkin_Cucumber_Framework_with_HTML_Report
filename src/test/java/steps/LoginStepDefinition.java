package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage; 
	DatabasePage databasePage;

	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}
	
	
	@Given("^User is on Techfios login page$")
	public void User_is_on_Techfios_login_page() {
		initDriver();
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
	}

	@When("^User enter user name as \"([^\"]*)\"$")
	public void User_enter_user_name_as(String username) throws InterruptedException {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
		Thread.sleep(3000);
	}
	
	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
		Thread.sleep(3000);
	}

	@And("^User click on Signin button$")
	public void user_click_on_Signin_button() throws Throwable {
		loginPage.clickSignInButton();
		Thread.sleep(3000);
	}
	
	@When("^User enter \"([^\"]*)\" from mysql database$")
	public void user_enter_from_mysql_database(String data) throws Throwable {
		switch(data) {
		case "username":
			System.out.println("Username from DB: "+ databasePage.getData("username"));
			loginPage.enterUserName(databasePage.getData("username"));
			Thread.sleep(3000);
			break;
		case "password":
			System.out.println("Username from DB: "+ databasePage.getData("password"));
			loginPage.enterUserName(databasePage.getData("password"));
			break;
		default:
			System.out.println("unable to enter data!");
		}
	 
	}


	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
		System.out.println("User landed on Dashboardpage");
		takeScreenshot(driver);
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
