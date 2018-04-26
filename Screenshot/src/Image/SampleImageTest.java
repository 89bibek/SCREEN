package Image;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClas;

@Listeners(com.actitime.genericLib.SampleTest.class)
public class SampleImageTest 
{
	public static  WebDriver driver; 
     @Test
     public void DeleteTest()
     {
    	 
    	 driver= new FirefoxDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 // driver.get("http://desktop-dlomk44/login.do");
    	  
    	  
    	  
    	  
    	  
    	 //Assert.assertEquals("A", "B");
    	 System.out.println("delete test");
     }
}
