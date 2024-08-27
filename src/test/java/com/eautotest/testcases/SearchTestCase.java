package com.eautotest.testcases;

import org.testng.annotations.Test;

import com.eautotest.pages.BaseTest;
import com.eautotest.pages.LoginPage;
import com.eautotest.pages.SearchPage;
import com.eautotest.utility.ReadExcelFile;

public class SearchTestCase extends BaseTest {
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestPortalData.xlsx";
	@Test(priority=1)
	void searchCourseTest()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		SearchPage sp= new SearchPage(driver);
		String searchCourse=ReadExcelFile.getCellValue(fileName, "SearchCourse", 0, 0);
		sp.searchCourse(searchCourse);
	}
}
