package com.inetbanking.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		//Step 1
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");

		Thread.sleep(5000);
		
		//Step 2
		lp.clickSubmit();
		
		Thread.sleep(5000);

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}