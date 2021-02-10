package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChechOutCompletePage {
	WebDriver driver;
	WebElement thankYouText;
	
	
	public WebElement getThankYouText() {
		return driver.findElement(By.className("complete-header"));
	}


	public ChechOutCompletePage(WebDriver driver) {
		this.driver = driver;
	}
}
