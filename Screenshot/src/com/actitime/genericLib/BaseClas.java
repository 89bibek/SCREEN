package com.actitime.genericLib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.ObjectRepository.Common;
import com.actitime.ObjectRepository.Login;

public class BaseClas 
{
    public static WebDriver driver;
    FileData fil = new FileData();
    Properties pobj;
    
    //@Parameters("browser")
    
    @BeforeClass
    public void configBC() throws Throwable  //String B_Name)
    {
    	System.out.println("launch d browser");
    	//driver.manage().window().maximize();
    	pobj=fil.getProperties();
    	//BaseClas.driver.manage().window().maximize();
    	String B_Name=pobj.getProperty("browser");
    	
    	
    	
    	
    	
    	if(B_Name.equals("firefox"))
    	{
    		driver = new FirefoxDriver();
    	  driver.manage().window().maximize();
    		driver.get(pobj.getProperty("url"));
    		//driver.get("http://desktop-dlomk44/login.do");
    		
    	}
    	else if(B_Name.equals("chrome"))
    	{
    	  System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
    	  driver= new ChromeDriver();
    	  driver.manage().window().maximize();
  		driver.get(pobj.getProperty("url"));
    	 // driver.get("http://desktop-dlomk44/login.do");
    	}
    }
    
    
    @BeforeMethod
    public void configBM()
    {
    	System.out.println("login");
    	driver.manage().window().maximize();
    	driver.get(pobj.getProperty("url"));
    	Login lpage=PageFactory.initElements(driver, Login.class);
    	lpage.login("admin", "manager");
    			//.initElements("admin", "manager");
    }
    
    
    
    @AfterMethod
    public void configAM()
    {
    	System.out.println("logout");
    	Common cpage= PageFactory.initElements(driver, Common.class);
    	cpage.Log_out();
    }
    
    @AfterClass
    public void configAC()
    {
    	System.out.println("close d browser");
    	driver.close();
    }
    
}
