package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		// Open the browser
		driver.get("https://www.training-support.net/webelements/selects");

		// Verify page title
		System.out.println("Page title is: " + driver.getTitle());

		// find the select element and create dropdown box
		WebElement combobox = driver.findElement(By.cssSelector("select.h-10"));
		Select dropdown = new Select(combobox);

//		On the Single Select:
//			Select the second option using the visible text.
		dropdown.selectByVisibleText("One");
		System.out.println(dropdown.getFirstSelectedOption().getText());

//			Select the third option using the index.
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());

//			Select the fourth option using the value.
		dropdown.selectByValue("three");
		System.out.println(dropdown.getFirstSelectedOption().getText());

//			Get all the options and print them to the console.
		for (WebElement option : dropdown.getOptions()) {
			System.out.println(option.getText());
		}

//			Close the browser.
		driver.quit();
	}

}
