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

public class ProjectActivity2 {
//	Goal:​ ​  ​ Read the heading of the website and verify the text 
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

	@Test
	public void pageHeading() {
//	c. Get the heading of the webpage.
//	d. Make sure it matches “Learn from Industry Experts” exactly.
		WebElement heading = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']"));
		Assert.assertEquals(heading.getText(), "Learn from Industry Experts");

	}

	@AfterClass
	public void tearDown() {
//	e. If it matches, close the browser.
		driver.quit();
	}

}
