package com.actitime.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectandCustomer 
{
    @FindBy(xpath="//input[@value='Create New Customer']")
    WebElement clk_CreteNewCustomr;
    
    @FindBy(xpath="//input[@value='Create New Project']")
    WebElement clk_CreteNewProjct;
    
    
    public void CreatNewCust()
    {
    	clk_CreteNewCustomr.click();
    }
    
    public void CretNewPro()
    {
    	clk_CreteNewProjct.click();
    }
}
