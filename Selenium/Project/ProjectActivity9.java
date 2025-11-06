package seleniumFSTLMSproject;

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

public class ProjectActivity9 {
//	Goal:​ ​ Navigate to the “All Courses” page and count the number of courses.
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
//	d. Select the menu item that says “All Courses” and click it. 
	@Test(priority = 1)
	public void myAccount() {
		driver.findElement(By.linkText("All Courses")).click(); // *[@id="menu-item-1507"]/a
	}

//  e. Select any course and open it.
	@Test(priority=2)
	public void selectCourse() {
		//Selecting first occuring course i.e Social Media Marketing
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		//clicking on course content for this need to login
		driver.findElement(By.linkText("Login to Enroll")).click();
		
		//entering username and password and click Login 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("user_login"))).sendKeys("root");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("user_pass"))).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();		
	}
	
//	f.  Click on a lesson in the course. Verify the title of the course. 
	@Test(priority=3)
	public void courseVerifyTitle() {
		driver.findElement(By.xpath("(//div[@class='ld-item-title'])[1]")).click();
		
		//Verifying title
		Assert.assertEquals(driver.getTitle(), "Developing Strategy – Alchemy LMS");
	}
	
//	g. . Click the Mark Complete button on the page (if available).
	@Test(enabled=false)
	public void markComplete() {
		
	}

	@AfterClass
	public void tearDown() {
//	f. If it matches, close the browser.
		driver.quit();
	}

}
