package test5tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests{
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/index.html");
		Thread.sleep(2000);
	}
	
	@Test
	public void logIn() throws InterruptedException {
		
		
		indexPage.insertUsername("standard_user");
		indexPage.insertPassword("secret_sauce");
		Thread.sleep(2000);
		indexPage.logInButtonClick();
		Thread.sleep(2000);
		inventoryPage.ClickOnTheButton();
		Thread.sleep(2000);
		String textForAssert = inventoryPage.getLogOutAssertButton().getText();
		Assert.assertEquals(textForAssert, "Logout");
		Thread.sleep(2000);
		
	}
	@Test
	public void addItem()throws InterruptedException {
		//this.logIn();
		//Thread.sleep(2000);
		//inventoryPage.clickOnX();
		indexPage.insertUsername("standard_user");
		indexPage.insertPassword("secret_sauce");
		Thread.sleep(2000);
		indexPage.logInButtonClick();
		Thread.sleep(2000);
	
		inventoryPage.addToCart();
		Thread.sleep(5000);
		inventoryPage.clickOnCart();
		Thread.sleep(2000);
		cartPage.clickOnCheckout();
		Thread.sleep(2000);
		checkOutStepOnePage.insertFirstName("Pera");
		checkOutStepOnePage.insertLastName("Peric");
		checkOutStepOnePage.insertPostalCode("21000");
		Thread.sleep(2000);
		checkOutStepOnePage.clickOnContinue();
		Thread.sleep(2000);
		checkOutStepTwoPage.clickOnFinish();
		Thread.sleep(2000);
		
		String textForAssert2 = chechOutCompletePage.getThankYouText().getText();
		Assert.assertEquals(textForAssert2, "THANK YOU FOR YOUR ORDER");
		Thread.sleep(2000);
	}
	
	
	
	
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
