package com.quantumcrm.Potentials;

import org.testng.annotations.Test;

import com.quantumcrm.genericLib.BaseTest;
import com.quantumcrm.genericLib.FileLib;
import com.quantumcrm.pages.NewPotentialPage;
import com.quantumcrm.pages.PotentialPage;
import com.quantumcrm.pages.SignInPage;

public class NewPotentialsPage extends BaseTest {
	@Test
	public void PotentialPages() throws Throwable
	{
	FileLib flib=new FileLib();
	SignInPage sp=new SignInPage();
	sp.login(flib.readPropertyData(PROP_PATH,"un"),
			flib.readPropertyData(PROP_PATH,"pw"));
	PotentialPage pp=new PotentialPage();
	pp.clickPotentialsTab();
	NewPotentialPage npp=new NewPotentialPage();
	
	npp.clicknewpotential(flib.readPropertyData(PROP_PATH,"ptname"),
			flib.readPropertyData(PROP_PATH,"accname"),
			flib.readPropertyData(PROP_PATH,"date"));
//	flib.readPropertyData(PROP_PATH,"stgname"));
	

	

}
}