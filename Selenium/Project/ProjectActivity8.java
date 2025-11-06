package seleniumFSTLMSproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity8 {
//	Goal:​ ​ Navigate to the “Contact Us” page and complete the form. 
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
//	a. Open a browser. 
		driver = new FirefoxDriver();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//	b. Navigate to ‘​https://alchemy.hguy.co/lms​’.
		driver.get("https://alchemy.hguy.co/lms");
	}

//	c. Find the navigation bar. 
//	d. Select the menu item that says “Contact” and click it. 
	@Test(priority = 1)
	public void myAccount() {
		driver.findElement(By.linkText("Contact")).click(); 
	}

//	e. Find the contact form fields (Full Name, email, etc.)
//	f. Fill in the information and leave a message. 
	@Test(priority=2)
	public void contactMessage() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("Durgaprasad Pagad");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("durgapagad@lms.com");
		driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']")).sendKeys("Let's Connect – Content Marketing Collaboration Opportunity");
		driver.findElement(By.xpath("//textarea[@name='wpforms[fields][2]']")).sendKeys("Hi, I'm reaching out to explore a potential collaboration in content marketing. I believe your expertise could be a great fit for some initiatives we're working on. Would you be open to connecting?");
//	g. click submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
//	h. Read and print the message displayed after submission.
	@Test(priority=3)
	public void readSuccessMessage() {
		String successMessage = driver.findElement(By.xpath("//*[@id=\"wpforms-confirmation-8\"]/p")).getText();
		System.out.println(successMessage);
	}

	@AfterClass
	public void tearDown() {
//	f. If it matches, close the browser.
		driver.quit();
	}

}
