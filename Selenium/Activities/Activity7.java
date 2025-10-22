package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		
//		Open a new browser to https://training-support.net/webelements/dynamic-controls
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
//			Get the title of the page and print it to the console.
		System.out.println("Page title is: "+ driver.getTitle());
		
//			On the page, perform:
//			Find the text field.
		WebElement textField= driver.findElement(By.xpath("//input[@id='textInput']"));
		
//		Check if the text field is enabled and print it.
		System.out.println("Is text field enabled? "+textField.isEnabled());
		
//		Click the "Enable Input" button to enable the input field.
		driver.findElement(By.xpath("//button[@id='textInputButton']")).click();
		
//		Check if the text field is enabled again and print it.
		System.out.println("Is text field enabled? "+textField.isEnabled());
		
//			Close the browser.
		driver.quit();

	}

}
