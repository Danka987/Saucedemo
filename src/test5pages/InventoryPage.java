package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	WebDriver driver;
	WebElement button;
	WebElement logOutAssertButton;
	WebElement closeMenuX;
	WebElement addToCartButton;
	WebElement cart;
	
	
	
	
	public WebElement getCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return driver.findElement(By.className("shopping_cart_container"));
	}
	public WebElement getAddToCartButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
	}
	public WebElement getCloseMenuX() {
		return driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[2]/div[2]/div/button"));
	}
	public InventoryPage (WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getButton() {
		return driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button"));
	}
	public WebElement getLogOutAssertButton() {
		return driver.findElement(By.id("logout_sidebar_link"));
	}
	
	public void ClickOnTheButton() {
		this.getButton().click();
	}
	
	public void clickOnX() {
		this.getCloseMenuX();
	}
	
	public void addToCart() {
		this.getAddToCartButton().click();
	}
	
	public void clickOnCart() {
		this.getCart().click();
	}
}
