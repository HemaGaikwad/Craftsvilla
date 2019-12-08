package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompage.CartPage;
import com.craftsvilla.pompage.CheckOutPage;
import com.craftsvilla.pompage.HomePage;
import com.craftsvilla.pompage.LinenSareesPage;
import com.craftsvilla.pompage.ProductDescriptionPage;
import com.craftsvilla.pompage.SareesPage;

public class LinenSareesScripts extends BaseTest
{
	HomePage homepage = null;
	SareesPage sp = null;
	LinenSareesPage lp = null;
	ProductDescriptionPage pd = null;
	CheckOutPage cp = null;
	
	@Test
	public void TC_01_linenSareeScript()
	{
		homepage = new HomePage(driver);
		sp = new SareesPage(driver);
		lp = new LinenSareesPage(driver);
		pd = new ProductDescriptionPage(driver);
		cp = new CheckOutPage(driver);
				
		
		homepage.goToSareesLink();
		sp.clickOnLinenSarees();
		lp.goToProduct1537544423();
		Assert.fail();
		pd.clickOnBuyNow();
		cp.setMobile("9986509551");
		cp.captureOTPMessage();
		cp.setOTP("8695");
		cp.clickOnLogin();
		
	}

}
