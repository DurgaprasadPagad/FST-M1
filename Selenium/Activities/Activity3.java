package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Open a new browser to https://training-support.net/webelements/login-form/
			WebDriver driver= new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://training-support.net/webelements/login-form/");		
			
//				Get the title of the page and print it to the console.
			System.out.println("Login page title: "+driver.getTitle());
			
//				Find the username field using any locator and enter "admin" into it.
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			
//				Find the password field using any locator and enter "password" into it.
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
			
//				Find the "Log in" button using any locator and click it.
			driver.findElement(By.xpath("//button[@class='svelte-1pdjkmx']")).click();
			
			String message= driver.findElement(By.xpath("//h1[contains(@class, 'text-emerald-500')]")).getText();
			System.out.println(message);
			
			driver.quit();

	}

}
