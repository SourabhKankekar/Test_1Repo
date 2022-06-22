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

public class Test_UseOfLibraryOfMethods   {

	public static void main(String[] args) throws IOException   {
// How to get numeric value data from Excel sheet. 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
			
		WebElement txt_email= driver.findElement(By.xpath("//input[@name='email']"));
		
		String filepath="C:\\Users\\soura\\eclipse-workspace\\mavenproject\\TestData\\TestCaseData.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
// We can not use numeric cell value as its return type is Double and 
//to use send keys method it has to be a string value.
		
	  double data=wb.getSheet("Sourabh").getRow(0).getCell(4).getNumericCellValue();
// So we have to convert this into string value
	  System.out.println(data); //1.2345678E7 its giving value like this
		
	  String data_1= String.valueOf(data).replace(".", "").replace("E7",""); 
	  System.out.println(data_1);
	    
	//  txt_email.sendKeys(data_1);
	  
	  GetString_Numericvalue("Sourabh",1,0);
		txt_email.sendKeys(GetString_Numericvalue("Sourabh",1,0));
		
	}
	
	public static String GetString_Numericvalue(String sheetname,int row,int cell) throws IOException {
		String filepath="C:\\Users\\soura\\eclipse-workspace\\mavenproject\\TestData\\TestCaseData.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		double data=wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		return String.valueOf(data).replace(".", "").replace("E9","");
	}
	
	

}
