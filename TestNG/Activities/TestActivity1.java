package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
	// Driver object
	WebDriver driver;
	WebDriverWait wait;

	// Setup function
	@BeforeClass
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();

		// Initialize the wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the test page
		driver.get("https://training-support.net");
	}

	// Actual tests

	@Test(priority = 1)
	public void pageTitleTest() {
		// assertion
		Assert.assertEquals(driver.getTitle(), "Training Support");

	}

	@Test(priority = 2)
	public void aboutLinkTest() {
		// Get the page title
//			String pageTitle= driver.getTitle();
		driver.findElement(By.linkText("About Us")).click();

		// Assertion
		wait.until(ExpectedConditions.titleContains("About"));
		Assert.assertEquals(driver.getTitle(), "About Training Support");

	}

	// Teardown functions
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

	// order of execution of tests is with @annotation & function names in
	// alphabetical order as priority2 and can be modified by using
	// @Test(priority=1,2,3..)
	//@Test(dependsOnMethods={"openPage"}) for login, if there are login(), openPage(), logout() 
	//@Test(enabled=false) to skip/ disable test; default is true
	// we can implement conditional skip using "if" loop
}
