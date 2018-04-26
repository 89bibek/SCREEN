package com.actitime.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Common 
{
	//public static WebDriver driver = new FirefoxDriver();
    
    @FindBy(linkText="Logout")
    WebElement Logout_Link;
    
    public void Log_out()
    {
    	Logout_Link.click();
    }
}
