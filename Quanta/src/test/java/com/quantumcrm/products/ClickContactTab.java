package com.quantumcrm.products;

import org.testng.annotations.Test;

import com.quantumcrm.genericLib.BaseTest;
import com.quantumcrm.genericLib.FileLib;
import com.quantumcrm.pages.ContactsPage;
import com.quantumcrm.pages.CreateContactPage;
import com.quantumcrm.pages.CustomViewPage;
import com.quantumcrm.pages.HomePage;
import com.quantumcrm.pages.SignInPage;

public class ClickContactTab extends BaseTest {

	@Test
public  void createContactPage() throws Throwable {
	
	SignInPage sp=new SignInPage();
	FileLib flib=new FileLib();
	sp.login(flib.readPropertyData(PROP_PATH,"un"),
			flib.readPropertyData(PROP_PATH,"pw"));
	
	//HomePage hp=new HomePage();
	//hp.clickHomeTab();
	
	ContactsPage cp=new ContactsPage();
	cp.clickContactTab();
	 
	CustomViewPage cvp=new CustomViewPage();
	cvp.clicknewContactBtn();
	
	CreateContactPage ccp=new CreateContactPage();
	ccp.lname(flib.readPropertyData(PROP_PATH,"ln"),
			flib.readPropertyData(PROP_PATH,"ln1"),
			flib.readPropertyData(PROP_PATH,"ln2"));
	
	
}

	private static void click() {
		// TODO Auto-generated method stub
		
	}
}
