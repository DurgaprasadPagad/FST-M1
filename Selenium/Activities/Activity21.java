package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		// create the wait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the browser
		driver.get("https://www.training-support.net/webelements/tabs");

		// Verify page title
		System.out.println("Page title is: " + driver.getTitle());

		// Find and click button to open new tab
		driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		// print the handle of the current tab
		System.out.println("Current tab handle: " + driver.getWindowHandle());
		// print handles of all the open tabs
		System.out.println("All open tab handles: " + driver.getWindowHandles());

		// switch to the newest tab
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		// print the handle of the current tab
		System.out.println("Current tab handle: " + driver.getWindowHandle());
		// print handles of all the open tabs
		System.out.println("All open tab handles: " + driver.getWindowHandles());

//		Close the browser.
		driver.quit();

	}

}
