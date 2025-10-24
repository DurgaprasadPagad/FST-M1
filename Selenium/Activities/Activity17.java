package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		driver.get("https://www.training-support.net/webelements/selects");

		// Verify page title
		System.out.println("Page title is: " + driver.getTitle());

		WebElement listbox = driver.findElement(By.cssSelector("select.h-80"));
		// Create the Select object
		Select multiList = new Select(listbox);
//        On the Multi Select:
//        	Select the "HTML" option using the visible text.
		multiList.selectByVisibleText("HTML");

//        	Select the 4th, 5th and 6th options using the index.
		for (int i = 3; i <= 5; i++) {
			multiList.selectByIndex(i);
		}

//        	Select the "Node" option using the value.
		multiList.selectByValue("nodejs");

//        	Deselect the 5th option using index.
		multiList.deselectByIndex(4);
//        	Close the browser.

	}

}
