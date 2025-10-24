package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		// Open the browser
		driver.get("https://www.training-support.net/webelements/alerts");

		// Verify page title
		System.out.println("Page title is: " + driver.getTitle());

//			Find the button to open a prompt alert and click it.
		driver.findElement(By.id("prompt")).click();

//			Switch the focus from the main window to the Alert box and 
		Alert prompAlert = driver.switchTo().alert();

//		get the text in it and print it.
		System.out.println("Text in the alert: " + prompAlert.getText());

		// type into the alert
		prompAlert.sendKeys("Awesome!");
		Thread.sleep(5000);

		// Close the alert by clicking OK
		prompAlert.accept();
		// Print the message
		System.out.println(driver.findElement(By.id("result")).getText());

		// Close the browser
		driver.quit();
	}

}
