package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ActionClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		// Using Shift key to Add Letters In Upper Case by actions class
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		act.keyDown(txt_email,Keys.SHIFT).sendKeys("sourabh kankekar").keyUp(Keys.SHIFT).build().perform();
		
		// Selecting all text which we need to copy...... ctrl + a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		// Now will perform copy operation .... ctrl + c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		// Now we need to find web element where we need to paste the text.
		WebElement txt_pass= driver.findElement(By.xpath("//input[@type='password']"));
		// we have to click on that web element then only we can paste that.
		txt_pass.click();
		
		//Now will perform paste operation.... ctrl + v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
	}

}
