package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		driver.get("https://www.training-support.net/webelements/alerts");

		// Verify page title
		System.out.println("Page title is: " + driver.getTitle());

//		Find the button to open a SIMPLE alert and click it.
		driver.findElement(By.id("simple")).click();

//		Switch the focus from the main window to the Alert box and get the text in it and print it.
		// switch focus to simple alert
		Alert simpleAlert = driver.switchTo().alert();

		// Print the text from the alert
		System.out.println("Text from alert: " + simpleAlert.getText());

//		Close the alert once with OK.
		simpleAlert.accept();

		// print the message
		System.out.println(driver.findElement(By.id("result")).getText());

//		Close the browser.
		driver.quit();
	}

}
