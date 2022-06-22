package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice_scrnshot {

	@Test
	public void TakeSCSht() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();	
		
	//	String rs=RandomString.make(3);
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File scr=ts.getScreenshotAs(OutputType.FILE);
		
	  File dst=new File("C:\\Users\\soura\\eclipse-workspace\\mavenproject\\sc2\\scr.png");
	  
	  FileUtils.copyFile(scr, dst);
	  
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
