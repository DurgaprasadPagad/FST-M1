package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		// create the wait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the browser
		driver.get("https://www.training-support.net/webelements/popups");

		// Print page title
		System.out.println("Page title is: " + driver.getTitle());

//			Find the button on the page and click it to launch the popup.
		driver.findElement(By.id("launcher")).click();

//			Wait for the popup to appear and then enter the credentials:
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));

		// Find input filed and send keys
//			username: admin
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
//			password: password
//			Click submit and print the message on the page after logging in.
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

//			Finally, close the browser.
		driver.quit();
	}

}
