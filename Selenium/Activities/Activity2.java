package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Open a new browser to https://training-support.net/webelements/login-form/
		WebDriver driver= new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form/");		
		
//			Get the title of the page and print it to the console.
		System.out.println("Login page title: "+driver.getTitle());
		
//			Find the username field using any locator and enter "admin" into it.
		driver.findElement(By.id("username")).sendKeys("admin");
		
//			Find the password field using any locator and enter "password" into it.
		driver.findElement(By.name("password")).sendKeys("password");
		
//			Find the "Log in" button using any locator and click it.
		driver.findElement(By.className("svelte-1pdjkmx")).click();
		
//		String message= driver.findElement(By.cssSelector("h2.text-gray-800")).getText();
//		System.out.println(message);
//			Close the browser.
		driver.quit();
	}

}
