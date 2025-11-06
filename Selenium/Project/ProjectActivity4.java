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

public class ProjectActivity4 {
//	Goal:​ ​ Read the title of the second most popular course on the website and verify the text  
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
	public void secondMostPopular() {
//	c. Get the title of the second most popular course. 
//	d. Make sure it matches “Email Marketing Strategies” exactly.
		WebElement popularCourse2 = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]"));
		Assert.assertEquals(popularCourse2.getText(), "Email Marketing Strategies");

	}

	@AfterClass
	public void tearDown() {
//	e. If it matches, close the browser.
		driver.quit();
	}

}
