package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_8_asserts {
	
	@Test
	public void test_001() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	
		
		//Assert.assertEquals(actaul, expected); // pass
		
		Assert.assertEquals(txt_email.isEnabled(), true); // pass - Hard Assert /Fail
		
		System.out.println(txt_email.isEnabled()); // true
		System.out.println("Test");
		System.out.println("Hello");
		
		
		
	}
	@Test
	public void test_002() {
		
		SoftAssert soft=new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));

         soft.assertEquals(txt_email.isEnabled(), true); // pass ---Fail
         System.out.println("Test");
         soft.assertTrue(true); // fail
         System.out.println("Test_2");
         
         soft.assertAll(); // Ommit-->
         
		
	}
}
	
	
	


