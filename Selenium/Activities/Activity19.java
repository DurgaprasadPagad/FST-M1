package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		driver.get("https://www.training-support.net/webelements/alerts");

		// Verify page title
		System.out.println("Page title is: " + driver.getTitle());

//			Find the button to open a CONFIRM alert and click it.
		driver.findElement(By.id("confirmation")).click();

//			Switch the focus from the main window to the Alert box and 
		Alert confirmAlert = driver.switchTo().alert();

//		get the text in it and print it.
		System.out.println("Text in the alert: " + confirmAlert.getText());

//			Close the alert once with Ok and again with Cancel.
		confirmAlert.accept();

		// with Cancel
//		confirmAlert.dismiss();

//			Close the browser.
		driver.quit();

	}

}
