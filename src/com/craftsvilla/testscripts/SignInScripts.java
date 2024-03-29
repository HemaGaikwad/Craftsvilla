package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pompage.HomePage;
import com.craftsvilla.pompage.SignInPage;

public class SignInScripts extends BaseTest
{
	HomePage hp = null;
	SignInPage sp = null;
	
	@Test
	public void TC_01_SignIn()
	{
		hp = new HomePage(driver);
		sp = new SignInPage(driver);
		
		try
		{
			String[][] credentials = ReadExcel.getData(FILEPATH, "Sheet1");
			for(int i = 1; i<=credentials.length; i++)
			{
				String email = credentials[i][0];
				String password = credentials[i][1];
				
				hp.clickOnSignInLink();
				sp.setEmail(email);
				sp.clickOnContinue();
				sp.enterPassword(password);
				sp.clickOnLoginButton();
				hp.gotoAccount();
				hp.clickOnLogout();
				
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
}
