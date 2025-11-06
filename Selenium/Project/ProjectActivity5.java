package seleniumFSTLMSproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity5 {
//	Goal:​ ​ Navigate to the “My Account” page on the site. 
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
//	a. Open a browser. 
		driver = new FirefoxDriver();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//	b. Navigate to ‘​https://alchemy.hguy.co/lms​’.
		driver.get("https://alchemy.hguy.co/lms");
	}
	
//	c. Find the navigation bar. 
//	d. Select the menu item that says “My Account” and click it. 
	@Test
	public void myAccount() {
	driver.findElement(By.linkText("My Account")).click();	//*[@id="menu-item-1507"]/a
	}
	
//	e. Read the page title and verify that you are on the correct page. 
	@Test
	public void myAccountPageTitle() {
		Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
	}
	
	@AfterClass
	public void tearDown() {
//	e. If it matches, close the browser.
		driver.quit();
	}
}
