package com.actitime.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask 
{
    @FindBy(linkText="Projects & Customers")
    WebElement clk_ProjtandCustomr;
    
    public void proandCust()
    {
    	clk_ProjtandCustomr.click();
    }
}
