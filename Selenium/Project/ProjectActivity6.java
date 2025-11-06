package seleniumFSTLMSproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity6 {
//	Goal:​ ​ Open the website and log-in using the provided credentials. 
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
	@Test(priority = 1)
	public void myAccount() {
		driver.findElement(By.linkText("My Account")).click(); // *[@id="menu-item-1507"]/a
	}

//	e. Read the page title and verify that you are on the correct page. 
	@Test(priority = 2)
	public void myAccountPageTitle() {
		Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
	}

	@Test(priority = 3)
	@org.testng.annotations.Parameters({ "username", "password" })
	public void loginTest(String username, String password) {
		/*
		 * // f. Find the “Login” button on the page and click it.
		 * driver.findElement(By.linkText("Login")).click();
		 * 
		 * // g & h. Find the username and password field of the login form and enter
		 * the username & password into that field.
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("user_login"))).
		 * sendKeys("root");
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("user_pass"))).
		 * sendKeys("pa$$w0rd");
		 */
		// f. Find the “Login” button on the page and click it.
			 driver.findElement(By.linkText("Login")).click();
		WebElement usernameField = driver.findElement(By.id("user_login"));
        WebElement passwordField = driver.findElement(By.id("user_pass"));
 
        // Enter credentials
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
 
		
		// i. Find the login button and click it.
		driver.findElement(By.id("wp-submit")).click();
	}

	
	@AfterClass
	public void tearDown() {
//	e. If it matches, close the browser.
		driver.quit();
	}
}
