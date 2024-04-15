package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Forgetpswdfunctionality {
	
	WebDriver driver;
	
	@Test
public void rstpswdwithunregemail() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("http://accounts.vmmaps.com");
		
		driver.findElement(By.id("login-email")).sendKeys("test$123@gmail.com");
		
		driver.findElement(By.cssSelector("span#Forgot-Password")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Pswd reset with unresgistered email - " + driver.findElement(By.xpath("//div[@class='email error']")).getText());
		
		driver.quit();
	}
	@Test
public void rstpswdwithregemail() throws InterruptedException {
        driver = new ChromeDriver();
		
		driver.get("http://accounts.vmmaps.com");
		
		driver.findElement(By.id("login-email")).sendKeys("sharaanbaskar1382@gmail.com");
		
        driver.findElement(By.cssSelector("span#Forgot-Password")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("Reset-form-text")).getText());
		
		driver.quit();
	}
	

}
