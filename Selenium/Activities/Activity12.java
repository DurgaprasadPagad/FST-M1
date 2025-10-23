package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-content");
		
//		page title verification
		System.out.println("Page title is: "+ driver.getTitle());
		
//		On the page, perform:
//		Find and click the "Click me!" button.
		driver.findElement(By.id("genButton")).click();
		
		//find the 
		WebElement wordElement= driver.findElement(By.id("word"));
		
		//wait for the required word
		wait.until(ExpectedConditions.textToBePresentInElement(wordElement, "porch"));
		
		//print the word
		System.out.println(wordElement.getText());
		
		//close the browser
		driver.quit();
		
	}

}
