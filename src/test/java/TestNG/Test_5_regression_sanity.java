package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_5_regression_sanity {
	@BeforeMethod
	public void BM() {
		System.out.println("Open Browser");
	}
	@Test(groups= {"Sanity"})
	public void Test_001() {
		System.out.println("Test 1");
	}
	@Test(groups= {"Regression"})
	public void Test_002() {
		System.out.println("Test 2");
	}
	@Test(groups= {"Sanity"})
	public void Test_003() {
		System.out.println("Test 3");
	}
	@Test(groups= {"Regression"})
	public void Test_004() {
		System.out.println("Test 4");
	}
	@AfterMethod
	public void AM() {
		System.out.println("Close Browser");	
	}
	
}
