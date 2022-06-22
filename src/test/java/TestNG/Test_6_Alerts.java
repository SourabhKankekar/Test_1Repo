package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_6_Alerts {

	@Test
    public void Test_Alert() throws InterruptedException { 
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	
	WebElement cst_Id=driver.findElement(By.xpath("//input[@name='cusid']"));
	cst_Id.sendKeys("8407982246");
	Thread.sleep(3000);
	WebElement sbmt_btn =driver.findElement(By.xpath("//input[@name='submit']"));
	sbmt_btn.click();
	
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	
	Alert alt1=driver.switchTo().alert();
	System.out.println(alt1.getText());
	alt1.accept();
	
	
	Thread.sleep(4000);
	driver.close();
		
		
		
		
		
	}
	
	
	
}
