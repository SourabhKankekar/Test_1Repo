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

public class test_MethodForStringCellValue {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email= driver.findElement(By.xpath("//input[@name='email']"));
		WebElement txt_pass= driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login_btn= driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		String xyz=GetStringCellValue("Sourabh",1,1);//Password
		String abc=GetStringCellValue("Sourabh",0,0);// Email 
		  
		//String jkl=GetStringCellValue("Sourabh",3,0);                                            
		//String lkm=GetStringCellValue("Sourabh",3,1);                                   
		//String jiu =GetStringCellValue("Sourabh",3,2);          
		  
		// System.out.println(jkl); 
		// System.out.println(lkm);
		// System.out.println(jiu);
		  
		txt_email.sendKeys(abc);
		txt_pass.sendKeys(xyz);
		login_btn.click();
		
	}
	public static String GetStringCellValue (String Sheetname, int row, int cell) throws IOException {
		String filepath="C:\\Users\\soura\\eclipse-workspace\\mavenproject\\TestData\\TestCaseData.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook sk=new XSSFWorkbook(fis);
		return sk.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}
	

}
