package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutStepTwoPage {
	WebDriver driver;
	WebElement finishButton;
	
	public WebElement getFinishButton() {
		return driver.findElement(By.className("cart_button"));
	}

	public CheckOutStepTwoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnFinish() {
		this.getFinishButton().click();
	}
}
