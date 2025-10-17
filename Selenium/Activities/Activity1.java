package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net");

		System.out.println("Page title: " + driver.getTitle());
		
		//find and click the About button
		driver.findElement(By.cssSelector("a.card.svelte-4bhb3l")).click();
		
		//print the page title
		System.out.println("About page title is: "+driver.getTitle());

		driver.quit();

	}

}
