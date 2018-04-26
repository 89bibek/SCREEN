package com.actitime.loginTest;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.actitime.ObjectRepository.Login;
import com.actitime.genericLib.FileData;

public class LoginTest 
{
    FileData fil = new FileData();
    Properties pobj;
    public static WebDriver driver;
    @BeforeClass
    public void configBC() throws Throwable
    {
    	pobj= fil.getProperties();
    	driver.manage().window().maximize();
    	driver= new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
    public void verifyINvalidUserNameTest() throws Throwable
    {
    	String invalidUserName=fil.getExcelData("Sheet1", 3, 2);
    	String errMessage= fil.getExcelData("Sheet1", 3, 3);
    	driver.get(pobj.getProperty("url"));
    	Login lpage=PageFactory.initElements(driver, Login.class);
    	//enter invalid userName
    	lpage.getUser_Edt().sendKeys(invalidUserName);
    	lpage.getLogin_Btn().click();
    	String actMessge=lpage.getError_Msg().getText();
    	//verify ErrorMsg
    	Assert.assertEquals(errMessage, actMessge);
    }
    
    @Test
    public void verifyInvalidPassword() throws Throwable
    {
    	String invalidPasswrd=fil.getExcelData("Sheet1", 4, 3);
    	String errMessage=fil.getExcelData("Sheet1", 4, 4);
    	driver.get(pobj.getProperty("url"));
    	
    	Login lpage=PageFactory.initElements(driver, Login.class);
    	//enter invalid userName
    	lpage.getPwd_Edt().sendKeys(invalidPasswrd);
    	lpage.getLogin_Btn().click();
    	String actMessge=lpage.getError_Msg().getText();
    	//verify ErrorMsg
    	Assert.assertEquals(errMessage, actMessge);
    }
}
