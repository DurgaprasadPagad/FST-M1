package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
	
		//Creating the Actions object
		Actions action= new Actions(driver);
		
//		Open a new browser to https://training-support.net/webelements/keyboard-events
		driver.get("https://training-support.net/webelements/keyboard-events");
		
//			Get the title of the page and print it to the console.
		System.out.println("Page title is: "+ driver.getTitle());
		
//		press the key and type message
		action.sendKeys("This is coming from activity page: ").sendKeys(Keys.RETURN).build().perform();
		
//			On the page, type out a string from the Selenium script to show on the page
//		print the message from the page to the console
		String message= driver.findElement(By.cssSelector("h1.mt-3")).getText();
		System.out.println(message);
		
//			Close the browser.
		driver.quit();
	}

}
