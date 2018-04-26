package com.actitime.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login
{
     @FindBy(name="username")
    private WebElement User_Edt;
     
     @FindBy(name="pwd")
    private WebElement Pwd_Edt;
     
     @FindBy(id="loginButton")
    private WebElement Login_Btn;
     
     
     @FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")
    private WebElement Error_Msg;


	public WebElement getUser_Edt() 
	{
		return User_Edt;
	}


	public WebElement getPwd_Edt() 
	{
		return Pwd_Edt;
	}


	public WebElement getLogin_Btn() 
	{
		return Login_Btn;
	}


	public WebElement getError_Msg() 
	{
		return Error_Msg;
	}
     
     
     public void login(String U_Name,String Pswrd)
     {
    	 User_Edt.sendKeys(U_Name);
    	 Pwd_Edt.sendKeys(Pswrd);
     }
     
     public void login()
     {
    	 User_Edt.sendKeys("admin");
    	 Pwd_Edt.sendKeys("manager");
     }
   
}
