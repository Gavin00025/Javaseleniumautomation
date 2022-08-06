package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects.ApplicationFormPage;
import PageObjects.HomePage;
import PageObjects.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ApplicationForm extends TestBase{

	WebDriver driver = getDriver();
	ApplicationFormPage formpage;
	HomePage homepage;

	@Before 
	public void Browser_Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("I am on the Homepage")
	public void i_am_on_the_homepage() throws Throwable {
		
	}

	@Given("I click on More on Life insurance")
	public void i_click_on_more_on_life_insurance() throws Throwable {

	}

	@Given("I click on the types of life insurance ")
	public void i_click_on_the_types_of_life_insurance() throws Throwable {

	}
    
	@Given("I assert to check the given data is visible ")
	public void i_assert_to_check_the_given_data_is_visible() throws Throwable {

	}

	@When("the Get Life Insurance Quote is selected")
	public void the_get_life_insurance_quote_is_selected() throws Throwable {

	}

	@Then("user can fill the form with the testdata")
	public void user_can_fill_the_form_with_the_testdata() throws Throwable {

	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
