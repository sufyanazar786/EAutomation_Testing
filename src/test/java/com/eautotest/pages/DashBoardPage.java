package com.eautotest.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;

	public DashBoardPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"login-list\"]/li[1]/a") WebElement dashboardclick;
	
	@FindBy(xpath="//*[@id=\"learn-press-user-profile\"]/ul/li[3]") WebElement offerAcademies;
	
	@FindBy(xpath="//*[@id=\"tab-academies\"]/div/div/ul/li[5]/form/div/button") WebElement subscribeButton;
	
	public void dashBoardClick() {		
		dashboardclick.click();  
		offerAcademies.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subscribeButton);
		subscribeButton.click();	
	}
}
