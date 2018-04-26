package com.actitime.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home 
{
   @FindBy(xpath="//div[text()='Tasks']")
   WebElement clk_Tasks;
   
   @FindBy(xpath="//div[text()='Reports']")
   WebElement clk_Reports;
   
   @FindBy(xpath="//div[text()='Users']")
   WebElement clk_Users;
   
   public void Navigate_To_Taskpage()
   {
	   clk_Tasks.click();
   }
   
   public void NavigateTo_Reports()
   {
	   clk_Reports.click();
   }
}
