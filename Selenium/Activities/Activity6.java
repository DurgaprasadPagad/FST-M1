package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		
//		Open a new browser to https://training-support.net/webelements/dynamic-controls
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
//			Get the title of the page and print it to the console.
		System.out.println("Page title is: "+ driver.getTitle());
		
//			On the page, perform:
//			Find the checkbox input element.
		WebElement checkBox= driver.findElement(By.xpath("//input[@id='checkbox']"));
		
//			Check if it is not selected on the page.
		System.out.println("Is check box selected? "+checkBox.isSelected());
		
//			Click the "Remove Checkbox" button.
		checkBox.click();
		
//			Check if it is selected again and print the result.
		System.out.println("Is checkbox selected? "+checkBox.isSelected());
		
//			Close the browser.
		driver.quit();

	}

}

