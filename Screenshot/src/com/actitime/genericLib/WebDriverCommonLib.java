package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib
{
	public void waitforPageToLoad()
	{
		
    	BaseClas.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForElement(WebElement elemnt)
	{
		WebDriverWait wait = new WebDriverWait(BaseClas.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(elemnt));
		
	}
	
}
