package TestNG;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;


public class test_2Annotations_New {
	@BeforeMethod
	public void BM(String BrowserName) {
		System.out.println("Browser Open");
	}
	@Test(priority=1,enabled=false)// this annotation is used to avoid this particular test case.
	public void Test_1() {
		System.out.println("I am Test 1");
	}
	@Test(invocationCount=3)// this annotation is used to execute the test case repeatedly.
	public void Test_2() {
		System.out.println("I am Test 2");
	}
	@Test(priority=2)
	public void Test_3() {
		System.out.println("I am Test 3");
		Assert.assertTrue(false);// asserts is used to skip the test cases.
	}
	@Test(priority=4,dependsOnMethods="Tes_3")// this is used to control the flow of test execution it will execute only after test_3 is executed successfully/
	public void Test_4() {
		System.out.println("I am Test 4");
	}
	@AfterMethod
	public void AM() {
		System.out.println("Browser Close");
	}
	
}
