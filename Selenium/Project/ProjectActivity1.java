package seleniumFSTLMSproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity1 {
//	Goal:​ ​ Read the title of the website and verify the text 
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
//		a. Open a browser. 
		driver = new FirefoxDriver();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		b. Navigate to ‘​https://alchemy.hguy.co/lms​’.
		driver.get("https://alchemy.hguy.co/lms");
	}

	@Test
	public void pageTitle() {
//		c. Get the title of the website. 
//		d. Make sure it matches “Alchemy LMS – An LMS Application ' exactly.
		Assert.assertEquals(driver.getTitle(), "Alchemy LMS – An LMS Application");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
