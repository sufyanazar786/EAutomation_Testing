package com.eautotest.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.eautotest.pages.BaseTest;
import com.eautotest.pages.LoginPage;
import com.eautotest.utility.ReadExcelFile;

public class LoginTest extends BaseTest{
	
	@Test
	void verifyLogin() {
		LoginPage lp=new LoginPage(driver);
		String username="Demo12";
		String password="Test123456$";
		lp.loginPortal(username, password);
	}
	
	
}
