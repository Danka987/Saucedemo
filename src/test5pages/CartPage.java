package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;
	WebElement checkOutButton;
	
	
	
	public WebElement getCheckOutButton() {
		return driver.findElement(By.className("checkout_button"));
	}



	public CartPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnCheckout() {
		this.getCheckOutButton().click();
	}
	
}
