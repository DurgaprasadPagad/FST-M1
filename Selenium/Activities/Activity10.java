package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
//		Open a new browser to https://training-support.net/webelements/drag-drop
		driver.get("https://training-support.net/webelements/drag-drop");
		// creating actions object for build
		Actions builder = new Actions(driver);

//			Get the title of the page and print it to the console.
		System.out.println("Page title is: " + driver.getTitle());

//			On the page, perform:
//			Find the ball and simulate a click and drag to move it into "Dropzone 1".
		// ball1
		WebElement football = driver.findElement(By.id("ball"));
		// dropzone1
		WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
		// dropzone2
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

//			Verify that the ball has entered Dropzone 1.
		builder.clickAndHold(football).moveToElement(dropzone1).pause(Duration.ofSeconds(5)).release().build()
				.perform();
		if (dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped")) {
			System.out.println("Ball was dropped in zone1");
		}
		System.out.println("Ball was dropped in zone1");
//			Once verified, move the ball into "Dropzone 2".
		builder.dragAndDrop(football, dropzone2).pause(5).build().perform();
		if (dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped")) {
			System.out.println("Ball was dropped in zone2");
		}
		System.out.println("Ball was dropped in zone2");

//			Close the browser.
		driver.quit();
	}

}
