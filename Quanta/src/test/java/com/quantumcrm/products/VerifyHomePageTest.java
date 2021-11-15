package com.quantumcrm.products;

import org.testng.annotations.Test;

import com.quantumcrm.genericLib.BaseTest;
import com.quantumcrm.genericLib.FileLib;
import com.quantumcrm.genericLib.WebDriverCommonLib;
import com.quantumcrm.pages.HomePage;
import com.quantumcrm.pages.SignInPage;

public class VerifyHomePageTest extends BaseTest {
	@Test
public void HomePage() throws Throwable
	{
		//BaseTest bt=new BaseTest();
		//bt.openBrowser();
		SignInPage sp=new SignInPage();
		FileLib flib=new FileLib();
	sp.login(flib.readPropertyData(PROP_PATH,"un"),
			flib.readPropertyData(PROP_PATH,"pw"));	
		Thread.sleep(2000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(FileLib.readPropertyData(PROP_PATH,"homeTitle"),
				wlib.getPageTitle(),"homeTitle");
		
	Thread.sleep(2000);
	HomePage hp=new HomePage();
	hp.clickHomeTab();
		}
	}

