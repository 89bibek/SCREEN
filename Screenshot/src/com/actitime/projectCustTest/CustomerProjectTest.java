package com.actitime.projectCustTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.ObjectRepository.ActiveProjectandCustomer;
import com.actitime.ObjectRepository.CretaeNewCustomer;
import com.actitime.ObjectRepository.Home;
import com.actitime.ObjectRepository.OpenTask;
import com.actitime.genericLib.BaseClas;
import com.actitime.genericLib.FileData;
import com.actitime.genericLib.WebDriverCommonLib;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class CustomerProjectTest extends BaseClas
{
   FileData fil = new FileData();
   WebDriverCommonLib wev = new WebDriverCommonLib();
   @Test
   public void createCustomerTest() throws Throwable
   {
	   //Read test case data from excel
	   String cName= fil.getExcelData("sheet1", 1, 2);
	   //navigate to taskpage
	   Home hpage= PageFactory.initElements(driver, Home.class);
	   hpage.Navigate_To_Taskpage();
	   //navigate to task page
	   OpenTask Task=PageFactory.initElements(driver, OpenTask.class);
	   Task.proandCust();
	   //navigate to project and customer
	   ActiveProjectandCustomer act_proandCust = PageFactory.initElements(driver, ActiveProjectandCustomer.class);
	   act_proandCust.CreatNewCust();
	   //naviagte to create new customer page
	   CretaeNewCustomer newCustomr= PageFactory.initElements(driver, CretaeNewCustomer.class);
	   newCustomr.CretenewCustomer(cName);
	   
   }
   
   
   
   @Test
   public void ceatecustwithDesc() throws Throwable
   {
	   //Read test case data from excel
	   String cName= fil.getExcelData("sheet1", 2, 2);
	   String cDesc = fil.getExcelData("sheet1", 2, 3);
	   //navigate to task page
	   Home hpage= PageFactory.initElements(driver, Home.class);
	   hpage.Navigate_To_Taskpage();
	   wev.waitforPageToLoad();
	   
	 //navigate to project and customer
	   ActiveProjectandCustomer act_proandCust = PageFactory.initElements(driver, ActiveProjectandCustomer.class);
	   act_proandCust.CreatNewCust();
	   
	 //naviagte to create new customer page
	   CretaeNewCustomer newCustomr= PageFactory.initElements(driver, CretaeNewCustomer.class);
	   newCustomr.NewDescription(cName, cDesc);
	   
	   
   }
   
}
