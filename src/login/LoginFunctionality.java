package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginFunctionality {
	
WebDriver driver;
	
	
	@Test(priority=0)
public void loginwithvalusrvalpswd() throws InterruptedException {
	
	driver = new ChromeDriver();
	
	driver.get("http://accounts.vmmaps.com");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("login-email")).sendKeys("sharaanbaskar1382@gmail.com");
	
	driver.findElement(By.name("pswd")).sendKeys("Sky@4321");
	
	driver.findElement(By.className("Submit")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("profile")).click();
	
	driver.findElement(By.id("menu-logout"));
	
	System.out.println("Output for Val usrname and pswd - " + "Log-in Successful");
	
	driver.quit();
	
  }
	@Test(priority=3)
public void loginwithinvusrinvpswd() throws InterruptedException {
	driver = new ChromeDriver();
    
    driver.get("http://accounts.vmmaps.com");
    
    driver.manage().window().maximize();
		
	driver.findElement(By.id("login-email")).sendKeys("test$123@gmail.com");
		
	driver.findElement(By.name("pswd")).sendKeys("12456");
		
	driver.findElement(By.className("Submit")).click();
		
	Thread.sleep(2000);
		
	System.out.println("Output for Inv usrname and pswd - " + driver.findElement(By.id("signinFormError")).getText());
		
	driver.quit();
	
	}
	@Test(priority=2)
public void cassnvtyvrfwithlgncred() throws InterruptedException {
	driver = new ChromeDriver();
	
    driver.get("http://accounts.vmmaps.com");
    
    driver.manage().window().maximize();
		
	driver.findElement(By.id("login-email")).sendKeys("SHARAANBASKAR1382@GMAIL.COM");
		
	driver.findElement(By.name("pswd")).sendKeys("Sky@4321");
		
	driver.findElement(By.className("Submit")).click();
		
    Thread.sleep(2000);
		
	System.out.println("Output for Inv usrname and valid pswd in Edge browser - " + driver.findElement(By.id("signinFormError")).getText());
		
	driver.quit();
	
	}
	@Test(priority=1)
	public void cassnvtyvrfwithlgncredEb() throws InterruptedException {
		
		driver = new EdgeDriver();
		
	    driver.get("http://accounts.vmmaps.com");
	    
	    driver.manage().window().maximize();
			
		driver.findElement(By.id("login-email")).sendKeys("SHARAANBASKAR1382@GMAIL.COM");
			
		driver.findElement(By.name("pswd")).sendKeys("Sky@4321");
			
		driver.findElement(By.className("Submit")).click();
			
	    Thread.sleep(2000);
			
		System.out.println("Output for Inv usrname and valid pswd in Edge browser - " + driver.findElement(By.id("signinFormError")).getText());
			
		driver.quit();
	}
	
	@Test(priority=4)
	public void cassnvtyvrfwithlgncredFf() throws InterruptedException {
		
		driver = new FirefoxDriver();
		
	    driver.get("http://accounts.vmmaps.com");
	    
	    driver.manage().window().maximize();
			
		driver.findElement(By.id("login-email")).sendKeys("SHARAANBASKAR1382@GMAIL.COM");
			
		driver.findElement(By.name("pswd")).sendKeys("Sky@4321");
			
		driver.findElement(By.className("Submit")).click();
			
	    Thread.sleep(2000);
			
		System.out.println("Output for Inv usrname and valid pswd in Edge browser - " + driver.findElement(By.id("signinFormError")).getText());
			
		driver.quit();
	}
	@Test(priority=5)
	public void loginwithsplcharinusrpswd() throws InterruptedException {
		
		driver = new EdgeDriver();
		
	    driver.get("http://accounts.vmmaps.com");
	    
	    driver.manage().window().maximize();
			
		driver.findElement(By.id("login-email")).sendKeys("SHA$%^&SKAR1382@GMAIL.COM");
			
		driver.findElement(By.name("pswd")).sendKeys("$ky@0456");
			
		driver.findElement(By.className("Submit")).click();
			
	    Thread.sleep(2000);
			
		System.out.println("Output for Spl Characters(login credentials) in Edge browser - " + driver.findElement(By.id("signinFormError")).getText());
			
		driver.quit();
	}
}
