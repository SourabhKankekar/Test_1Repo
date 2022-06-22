package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.LoginPom;
import com.utility.BaseClass;

public class Test_1 extends BaseClass {
	
	
	@Test
	public void test_001() {
		
	LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.gettxt_email().sendKeys("Sourabh");
		login.gettxt_pass().sendKeys("kankekar");
	}
	
	@Test
	public void test_002() {
		
	LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.gettxt_email().sendKeys("Sourabh");
		login.gettxt_pass().sendKeys("kankekar");
	}
	@Test
	public void test_003() throws InterruptedException {
		
	LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.gettxt_email().sendKeys("Sourabh");
		Thread.sleep(2000);
		login.gettxt_pass().sendKeys("kankekar");
	}
	
	
	@Test
	public void test_004() {
		
	LoginPom	login=PageFactory.initElements(driver, LoginPom.class);
	login.gettxt_email().sendKeys("jdbcjkd");
	login.gettxt_pass().sendKeys("sjgcggg");
	}
	
	
	
	

}
