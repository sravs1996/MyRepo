package com.quantumcrm.products;

import org.testng.annotations.Test;

import com.quantumcrm.genericLib.BaseTest;
import com.quantumcrm.genericLib.FileLib;
import com.quantumcrm.pages.CampaignsPage;
import com.quantumcrm.pages.CreateCampaignPage;
import com.quantumcrm.pages.CustomViewPage;
import com.quantumcrm.pages.SignInPage;

public class newCampaignPage extends BaseTest {
	@Test
	public void CampaignPage() throws Throwable
	{
		SignInPage sp=new SignInPage();
		FileLib flib=new FileLib();
		sp.login(flib.readPropertyData(PROP_PATH,"un"),
				flib.readPropertyData(PROP_PATH,"pw"));
		CampaignsPage cp=new CampaignsPage();
      	cp.clickCampaignsTab();
		
		
		//cp.clickCampaignsTab(flib.readPropertyData(PROP_PATH,"sub"));
		//cp.clickCampaignsTab(flib.readPropertyData(PROP_PATH,"cn"));
		//WebDriverCommonLib wlib=new WebDriverCommonLib();
		//cp.clickCampaignsTab(wlib.);.
		CustomViewPage cvp=new CustomViewPage();
	cvp.clicknewCampaignBtn();
	CreateCampaignPage ccp=new CreateCampaignPage();
	ccp.clicknewCampaign(flib.readPropertyData(PROP_PATH,"cn"));
	ccp.clickeditTab(flib.readPropertyData(PROP_PATH,"ecn"));
		
		
	}

}
