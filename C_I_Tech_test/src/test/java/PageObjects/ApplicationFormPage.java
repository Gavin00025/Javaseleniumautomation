package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationFormPage {
	
	WebDriver driver;
	public ApplicationFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//SELECT____TYPE___CHECK
	@FindBy(css = "")
	WebElement HOME_PAGE;
	public void CHECK_USER_IS_ON_THE_HOMEPAGE() {
		HOME_PAGE.isDisplayed();
	}
	
	@FindBy(css = "")
	WebElement More_on_cover_options_button;
	public void Select_More_on_cover_options() {
		More_on_cover_options.click();
	}

	@FindBy(css = "")
	WebElement  type_of_life_insurance_button;
	public void Select_type_of_life_insurance() {
		type_of_life_insurance_button.click();
	}
	
	@FindBy(css = "")
	WebElement life_insurance_quote_is_selected;
	public void Type_life_insurance_quote_is_selected (String firstname) {
		life_insurance_quote_is_selected.click();
	}

	@FindBy(css = "")
	WebElement Cover_amount;
	public void Type_Cover_amount() {
		Cover_amount.sendKeys(Coveramount);
	}

	@FindBy(css = "")
	WebElement Cover_length;
	public void Type_Cover_length() {
		Cover_length.sendKeys(Coverlength);
	}

	@FindBy(css = "")
	WebElement btn_selected;
	public void Type_btn_selected() {
		Cover_amount.click();
	}
	@FindBy(css = "")
	WebElement First_name;
	public void Type_First_name (String Firstname) {
		First_name.sendKeys(Firstname);
	}
	
	@FindBy(css = "")
	WebElement Sur_name;
	public void Type_surname (String surname) {
		Sur_name.sendKeys(surname);
	}

	@FindBy(css = "")
	WebElement email_address;
	public void Type_Email_Address(String email) {
		email_address.sendKeys(email);
	}
	
	@FindBy(css = "")
	WebElement gender;
	public void gender() {
		gender.click();
	}
	
	@FindBy(css = "")
	WebElement second_person;
	public void second_person() {
		secondperson.click();
	}
	
	
}
