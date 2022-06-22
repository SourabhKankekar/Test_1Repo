package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_4 {
	
	@BeforeMethod
	public void BM() {
		System.out.println("Open Browser");
	}
	@Test
	public void Test_001() {
		System.out.println("Test 1");
	}
	@Test
	public void Test_002() {
		System.out.println("Test 2");
	}
	@Test
	public void Test_003() {
		System.out.println("Test 3");
	}
	@AfterMethod
	public void AM() {
		System.out.println("Close Browser");	
	}
	
	
	

}
