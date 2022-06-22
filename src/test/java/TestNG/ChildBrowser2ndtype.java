package TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser2ndtype {
	
	@Test
	public void verify_test01() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> window=driver.getWindowHandles();
		
		Iterator<String> it=window.iterator();
		
		String parentwindow=it.next();
		String childwindow=it.next();
		
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sourabhkankekar022@gmail.com");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.quit();
		driver.switchTo().window(parentwindow);
		driver.close();
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
