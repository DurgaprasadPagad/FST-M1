package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

//		Open a new browser to https://training-support.net/webelements/dynamic-controls
		driver.get("https://training-support.net/webelements/mouse-events");

		// create the Actions object
		Actions builder = new Actions(driver);

//			Get the title of the page and print it to the console.
		System.out.println("Page title is: " + driver.getTitle());

		// find the buttons on the webpage
		List<WebElement> buttons = driver.findElements(By.cssSelector("div.svelte-hs12g9"));
//		WebElement button1= buttons.get(0);

//		Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it. 
		builder.click(buttons.get(0)).pause(Duration.ofSeconds(1)).click(buttons.get(1)).build().perform();
		// Print the confirmation text at the end of the sequence.
		String message = driver.findElement(By.id("result")).getText();
		System.out.println(message);

//		Double click on the src button. Then right click on the target button and select open. 
		builder.doubleClick(buttons.get(2)).pause(Duration.ofSeconds(1)).contextClick(buttons.get(3))
				.pause(Duration.ofSeconds(1)).perform(); // breaking down whole becuase build does registering every
															// actions and perform
		builder.click(driver.findElement(By.xpath("//span[text()='Open']"))).pause(Duration.ofSeconds(1)).build()
				.perform(); // after one actions make use of build again, its good to use build

//		Print the confirmation text at the end of the sequence.
		String message1 = driver.findElement(By.id("result")).getText();
		System.out.println(message1);

//		Close the browser.
		driver.quit();
	}

}
