package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_10_ScrollDown {

	@Test
	public void test_ScrollDown() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();

// create reference of JavascriptExecutor and up cast it with driver
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
          //Scroll By Pixel		
// by using ref. var. of object call method executeScript and provide the pixel size
		js.executeScript("window.scrollBy(0,500)","");
		
		//	Scroll by Using Web Element	
		WebElement mrt_txt=driver.findElement(By.xpath("(//a[@class='_sv4'])[2]"));
// call the ref. var. and provide the argument as arguments[0].SrollIntoView(); and another parameter as web element	
			js.executeScript("arguments[0].scrollIntoView();",mrt_txt);
		
			//Scroll PAge till bottom
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
			
			
	}
	
	
	
	
	
	
}
