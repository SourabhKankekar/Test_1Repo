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
import net.bytebuddy.utility.RandomString;

public class Test_9_TakeScreenShot {

	@Test
	public void getScrnshot() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();

		String RS=RandomString.make(4);
		
//	Upcast this driver with TakeScreenShot by creating reference of TakeScreenShot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
// 	create object of file and provide the path in argument to save the screenshot.
		File dst=new File("C:\\Users\\soura\\eclipse-workspace\\mavenproject\\ScreenShot\\"+RS+".png");
		
		FileUtils.copyFile(src, dst); 
		
//	FileUtils.copyFile(File srcFile, File destFile)
		
//	when we capture sc then everytime it will get overwrite the previous image so if we want to store the new image everytime we use one method
// 	we need to create random String for that which is nothing but randomstring and pass the index so that from index it will create the name 
// 	from that index combination and will save that everytime we take screenshot
//	add that RS into the path of file
// 	it will randomly create the combination of name and name size will depends on index size that we pass in string.		
		
	}
	
	
	
	
	
	
}
