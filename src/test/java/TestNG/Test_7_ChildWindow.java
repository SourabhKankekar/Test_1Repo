package TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_7_ChildWindow {
	
	@Test
	public void Verify_tset002() throws InterruptedException {
		//Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentaddress=driver.getWindowHandle();// this will gives us the parent browser address.
		System.out.println(parentaddress);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> alladdress=driver.getWindowHandles();
		
		Iterator<String> it=alladdress.iterator();
		
		while(it.hasNext()) {
			
			String childwindowaddress=it.next();
			
			if(!parentaddress.equalsIgnoreCase(childwindowaddress)) {
				
				driver.switchTo().window(childwindowaddress);
				
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Sourabh");
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(2000);
				//driver.quit();
			}
			
		}
		driver.switchTo().window(parentaddress);
		driver.close();
		System.out.println(alladdress);
		
	}
	
	
	

}
