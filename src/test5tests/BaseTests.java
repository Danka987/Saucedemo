package test5tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import test5pages.CartPage;
import test5pages.ChechOutCompletePage;
import test5pages.CheckOutStepOnePage;
import test5pages.CheckOutStepTwoPage;
import test5pages.IndexPage;
import test5pages.InventoryPage;

public class BaseTests {
	WebDriver driver;
	IndexPage indexPage;
	InventoryPage inventoryPage;
	CartPage cartPage;
	CheckOutStepOnePage checkOutStepOnePage;
	CheckOutStepTwoPage checkOutStepTwoPage; 
	ChechOutCompletePage chechOutCompletePage;

	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		this.driver = new ChromeDriver();
        this.indexPage = new IndexPage(driver);
        this.inventoryPage = new InventoryPage(driver);
        this.cartPage = new CartPage(driver);
        this.checkOutStepOnePage = new CheckOutStepOnePage(driver);
        this.checkOutStepTwoPage = new CheckOutStepTwoPage(driver);
        this.chechOutCompletePage = new ChechOutCompletePage(driver);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void posleKlase() throws IOException {
		driver.close();
        driver.quit();
       
	}
}