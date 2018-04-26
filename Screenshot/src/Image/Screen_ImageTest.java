package Image;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

//import com.sun.jna.platform.FileUtils;

public class Screen_ImageTest 
{
    @Test
    public void screenTest() throws Throwable
    {
    	
    	WebDriver driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	driver.get("https://gmail.com");
    	EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
    	File srcfile= edriver.getScreenshotAs(OutputType.FILE);
    	
    	File destfile = new File("C:/MOR_SELENIUM_BATCH/Screenshot.png");
        FileUtils.copyFile(srcfile, destfile);
        
    }
}
