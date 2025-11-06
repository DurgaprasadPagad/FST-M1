package seleniumFSTLMSproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity7 {
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

//	e. Find all the courses on the page.
	@Test(priority = 2)
	public void allCourses() {
		List<WebElement> allCourses = driver
				.findElements(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']"));
		System.out.println("Number of courses on the page: " + allCourses.size());
	}

	@AfterClass
	public void tearDown() {
//	f. If it matches, close the browser.
		driver.quit();
	}

}
