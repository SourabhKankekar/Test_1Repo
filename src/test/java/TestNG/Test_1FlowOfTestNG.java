package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_1FlowOfTestNG {
	//Annotations
//Before----->
	@BeforeSuite
public void BS(){
	System.out.println("Before suite");
	}
	@BeforeClass
public void BC() {
	System.out.println("Before Class");
	}
	@BeforeTest
public void BT() {
	System.out.println("Before Test");
	}
	@BeforeMethod
public void BM() {
	System.out.println("Before Method");
	}
// Test ( Now Will write the test cases here which we need to execute	
@Test
public void Test_1() {
	System.out.println("I Am Test 1");
   	}
@Test
public void Test_2() {
	System.out.println("I Am Test 2");         
	}
// Now Annotations of After

//After
@AfterMethod
public void AM() {
	System.out.println("After Method");
}
@AfterTest
public void AT() {
	System.out.println("After Test");
}
@AfterClass
public void AC() {
	System.out.println("After Class");
}
@AfterSuite
public void AS() {
	System.out.println("After Suite");
}
	

}
