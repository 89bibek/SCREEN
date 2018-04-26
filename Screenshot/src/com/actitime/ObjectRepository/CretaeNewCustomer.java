package com.actitime.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CretaeNewCustomer
{
    @FindBy(name="name")
    WebElement Crete_NewCustomr;
    
    @FindBy(name="description")
    WebElement desc;
    
    @FindBy(name="createCustomerSubmit")
    WebElement Submt_CretCust;
    
    
    
    public void CretenewCustomer(String Customername)
    {
    	Crete_NewCustomr.sendKeys(Customername);
    	Submt_CretCust.click();
    }
    
    public void NewDescription(String CustomerName,String descriptn)
    {
    	Crete_NewCustomr.sendKeys(CustomerName);
    	desc.sendKeys(descriptn);
    	Submt_CretCust.click();
    }
    
}
