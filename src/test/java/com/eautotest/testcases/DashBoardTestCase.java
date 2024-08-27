package com.eautotest.testcases;

import org.testng.annotations.Test;

import com.eautotest.pages.BaseTest;
import com.eautotest.pages.DashBoardPage;
import com.eautotest.pages.LoginPage;
import com.eautotest.utility.ReadExcelFile;

public class DashBoardTestCase extends BaseTest{
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestPortalData.xlsx";
	
	@Test(priority =1)
	void testcourses()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		DashBoardPage dp =new DashBoardPage(driver);
		dp.dashBoardClick();
	}	
}
