package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1_Action {
	
	WebDriver driver;
	
	@BeforeTest
	public void Test1BeforeTest() throws Exception{
		
		Reporter.log("Open the Application");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.brightlab.com/authprod/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='navbar']/ul/li[1]/a")).click();
		Reporter.log("Login to the Application");
		Thread.sleep(5000);
		driver.findElement(By.id("loginForm:username")).sendKeys("deepakp414@mailinator.com");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin123");
		driver.findElement(By.id("signInButton")).click();
	}
	
	@Test
	public void Test1() throws Exception {
		
		Reporter.log("Navigate to Material page");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='slide-hover']/div[2]/ul/li[4]/a/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='slide-hover']/div[2]/ul/li[4]/ul/li[1]/a/span")).click();
		
	}
	
	@AfterTest
	public void Test1AfterTest() throws Exception {
		
		Reporter.log("Logout from the application");
		Thread.sleep(3000);
		driver.findElement(By.id("header-nameshortId1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logoutForm:logoutLink")).click();
		driver.close();
	}
	
}
