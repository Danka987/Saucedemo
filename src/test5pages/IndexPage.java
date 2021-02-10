package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {
	WebDriver driver;
	WebElement logInButton;
	WebElement userNameInputField;
	WebElement passwordNameInputField;
	
	public IndexPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getLogInButton() {
		return driver.findElement(By.id("login-button"));
	}
	public WebElement getUserNameInputField() {
		return driver.findElement(By.id("user-name"));
	}
	public WebElement getPasswordNameInputField() {
		return driver.findElement(By.id("password"));
	}
	
	public void insertUsername(String korisnickoIme) {
		this.getUserNameInputField().clear();
		this.getUserNameInputField().sendKeys(korisnickoIme);
	}
	
	public void insertPassword(String lozinka) {
		this.getPasswordNameInputField().clear();
		this.getPasswordNameInputField().sendKeys(lozinka);
	}
	
	public void logInButtonClick() {
		this.getLogInButton().click();
	}
	
	public void logIn(String korisnickoIme, String lozinka) {
		this.getUserNameInputField().sendKeys(korisnickoIme);
		this.getPasswordNameInputField().sendKeys(lozinka);
		this.logInButton.click();
	}

	
}
