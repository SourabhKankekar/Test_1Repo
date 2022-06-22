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

public class Test_GetNumericValue {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
	String filepath="C:\\Users\\soura\\eclipse-workspace\\mavenproject\\TestData\\TestCaseData.xlsx";
	
	FileInputStream abc= new FileInputStream(filepath);
	XSSFWorkbook fi=new XSSFWorkbook(abc);
//if we try to get numeric data from sheet It gives an exception [IllegalStateException: Cannot get a STRING value from a NUMERIC cell]	
// to get numeric value we have another method i.e getNumericCellValue.	
	//String xyz =fi.getSheet("Sourabh").getRow(1).getCell(0).getStringCellValue();
	//System.out.println(xyz);

// numeric cell value has return type as double
	double asd=fi.getSheet("Sourabh").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(asd);
	
// send keys method does not accept value other than CharSequence so we need to convert double value to string 	
// replace that . with null value as well as replace E9 with null value	
	String ghj=String.valueOf(asd).replace(".","").replace("E9","");
	txt_email.sendKeys(ghj);
	System.out.println(ghj);	
	}

}
