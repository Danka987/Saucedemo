package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutStepOnePage {
	WebDriver driver;
	WebElement firstNameField;
	WebElement lastNameField;
	WebElement postalCode;
	WebElement continueButton;

	public WebElement getFirstNameField() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getLastNameField() {
		return driver.findElement(By.id("last-name"));
	}

	public WebElement getPostalCode() {
		return driver.findElement(By.id("postal-code"));
	}

	public WebElement getContinueButton() {
		return driver.findElement(By.className("cart_button"));
	}

	public CheckOutStepOnePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void insertFirstName (String firstName) {
		this.getFirstNameField().sendKeys(firstName);
	}
	public void insertLastName (String lastName) {
		this.getLastNameField().sendKeys(lastName);
	}
	public void insertPostalCode (String postalCode) {
		this.getPostalCode().sendKeys(postalCode);
	}

	public CheckOutStepOnePage(String firstName, String lastName, String postalCode) {
		super();
		this.getFirstNameField().sendKeys(firstName);
		this.getLastNameField().sendKeys(lastName);
		this.getPostalCode().sendKeys(postalCode);
	}
	 public void clickOnContinue() {
		 this.getContinueButton().click();
	 }
	
}
