package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1stScript {
	WebDriver driver;	
@BeforeMethod
public void OpenBrowser() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
}
@Test(priority=1)
public void Test_a() throws InterruptedException {
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
	txt_email.sendKeys("Sourabh Kankekar");
	Thread.sleep(2000);
	System.out.println("i am a");
}
@Test(priority=2)
public void Test_b() throws InterruptedException {
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
	txt_email.sendKeys("Sourabh 96 Kankekar");
	Thread.sleep(2000);
	System.out.println("i am b");
}
@Test
public void Test_c() throws InterruptedException {
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
	txt_email.sendKeys("Sourabh 09/12/96 Kankekar");
	Thread.sleep(2000);
	System.out.println("i am c");
}
@AfterMethod
public void Close_Browser() {
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
