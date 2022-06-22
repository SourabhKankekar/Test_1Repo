package mavenproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1DataFromSheet {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	// Find Web Element for that which we need to Send data from Sheet	
		WebElement txt_Email=driver.findElement(By.xpath("//input[@name='email']"));
		
	// Get the path of Excel Sheet from which we need to Extract data	
		String filepath="C:\\Users\\soura\\eclipse-workspace\\mavenproject\\TestData\\TestCaseData.xlsx";

	// Create reference and pass the argument as filepath and for XSSFWorkbook pass the argument as ref. var. of FileInputStream	
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook bk=new XSSFWorkbook(fis);
		
		String data_1=bk.getSheet("Sourabh").getRow(0).getCell(0).getStringCellValue();
		Thread.sleep(3000);
		txt_Email.sendKeys(data_1);
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
