package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {
	WebDriver driver;
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void BM(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.get("https://www.onlinesbi.com/");
			System.out.println("Open Chrome Browser");
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			driver.get("https://www.facebook.com/login/");
			System.out.println("Open Edge Browser");
		}
	}
	@Test(priority=1,enabled=false)
	public void test_1() {
		System.out.println("Test 1");
	}
	@Test(priority=0,invocationCount=3)
	public void test_2() {
		System.out.println("Test 2");
	}
	@Test(priority=2)
	public void test_3() {
		System.out.println("Test 3");
		Assert.assertTrue(false);
	}
	@Test(priority=3,dependsOnMethods="test_3")
	public void test_4() {
		System.out.println("Test 4");
	}
	@AfterMethod
	public void AM() {	
		driver.quit();
		System.out.println("Browser Close");
	}
	
	
	
	
	
}
