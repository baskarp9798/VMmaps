package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserRegFunct {
	
	WebDriver driver;
	
	@Test(priority=0)
public void succregwithalfld() throws InterruptedException {
        driver = new ChromeDriver();
		
		driver.get("http://accounts.vmmaps.com");
		
		driver.findElement(By.id("signupToggle")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("signup-username")).sendKeys("#$@&");
		
		driver.findElement(By.name("signupEmail")).sendKeys("test321@gmail.com");
		
		driver.findElement(By.cssSelector("input#signup-mobile")).sendKeys("9884316298");
		
		driver.findElement(By.id("signup-password")).sendKeys("M@12345678");
		
		driver.findElement(By.cssSelector("input#signup-confirmPassword")).sendKeys("M@12345678");
		
		driver.findElement(By.cssSelector("input#terms-vms-policy")).click();
		
		driver.findElement(By.id("newsLetter")).click();
		
		driver.findElement(By.id("signup-submit-text")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Output for successful reg with all req field - "+ "redirects to user athentication");
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	@Test
	public void regfailduetusralrdyexst() throws InterruptedException {
	driver = new ChromeDriver();
	driver.get("http://accounts.vmmaps.com");
	
	driver.findElement(By.id("signupToggle")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("signup-username")).sendKeys("Baskar P");
	
	driver.findElement(By.name("signupEmail")).sendKeys("sharaanbaskar1382@gmail.com");
	
	driver.findElement(By.cssSelector("input#signup-mobile")).sendKeys("9884316298");
	
	driver.findElement(By.id("signup-password")).sendKeys("Sky@4321");
	
	driver.findElement(By.cssSelector("input#signup-confirmPassword")).sendKeys("Sky@4321");
	
	driver.findElement(By.cssSelector("input#terms-vms-policy")).click();
	
	driver.findElement(By.id("newsLetter")).click();
	
	driver.findElement(By.id("signup-submit-text")).click();
	
	Thread.sleep(1000);
	
	System.out.println("Output for already registered user - "+ driver.findElement(By.id("signupFormError")).getText());
	
	Thread.sleep(2000);
	
	driver.quit();
	}
	@Test
public void regfailsdu2invemail() throws InterruptedException {
    driver = new ChromeDriver();
		
	driver.get("http://accounts.vmmaps.com");
		
	driver.findElement(By.id("signupToggle")).click();
	Thread.sleep(2000);
		
	driver.findElement(By.id("signup-username")).sendKeys("Baskar P");
		
	driver.findElement(By.name("signupEmail")).sendKeys("baskar1382@com");
		
	driver.findElement(By.cssSelector("input#signup-mobile")).sendKeys("9884316298");
		
	driver.findElement(By.id("signup-password")).sendKeys("Sky@4321");
		
	driver.findElement(By.cssSelector("input#signup-confirmPassword")).sendKeys("Sky@4321");
		
	driver.findElement(By.cssSelector("input#terms-vms-policy")).click();
		
	driver.findElement(By.id("newsLetter")).click();
		
	driver.findElement(By.id("signup-submit-text")).click();
		
	Thread.sleep(3000);
		
	System.out.println("Output for inv email in registration field - "+ driver.findElement(By.id("signupEmailError")).getText());
		
	Thread.sleep(2000);
		
	driver.quit();
	}
	@Test
public void regfailsduetomincharatpswd() throws InterruptedException {
    driver = new ChromeDriver();
		
	driver.get("http://accounts.vmmaps.com");
		
	driver.findElement(By.id("signupToggle")).click();
	Thread.sleep(2000);
		
	driver.findElement(By.id("signup-username")).sendKeys("Skooby L");
		
	driver.findElement(By.name("signupEmail")).sendKeys("test321@gmail.com");
		
	driver.findElement(By.cssSelector("input#signup-mobile")).sendKeys("9884316298");
		
	driver.findElement(By.id("signup-password")).sendKeys("M@231");
		
	driver.findElement(By.cssSelector("input#signup-confirmPassword")).sendKeys("M@231");
		
	driver.findElement(By.cssSelector("input#terms-vms-policy")).click();
		
	driver.findElement(By.id("newsLetter")).click();
		
	driver.findElement(By.id("signup-submit-text")).click();
		
	Thread.sleep(3000);
		
	System.out.println("Output for not meeting min char in password field - "+ driver.findElement(By.id("signupPasswordError")).getText());
		
	Thread.sleep(2000);
		
	driver.quit();
	}
	@Test
public void splcharinnamefldregfails() throws InterruptedException {
    driver = new ChromeDriver();
		
	driver.get("http://accounts.vmmaps.com");
		
	driver.findElement(By.id("signupToggle")).click();
	Thread.sleep(2000);
		
	driver.findElement(By.id("signup-username")).sendKeys("#$@&");
		
	driver.findElement(By.name("signupEmail")).sendKeys("test321@gmail.com");
		
	driver.findElement(By.cssSelector("input#signup-mobile")).sendKeys("9884316298");
		
	driver.findElement(By.id("signup-password")).sendKeys("M@12345678");
		
	driver.findElement(By.cssSelector("input#signup-confirmPassword")).sendKeys("M@12345678");
		
	driver.findElement(By.cssSelector("input#terms-vms-policy")).click();
		
	driver.findElement(By.id("newsLetter")).click();
		
	driver.findElement(By.id("signup-submit-text")).click();
		
	Thread.sleep(3000);
		
	System.out.println("Output for spl char in name field - "+ driver.findElement(By.id("signupFormError")).getText());
		
	Thread.sleep(2000);
		
	driver.quit();
	}
}
