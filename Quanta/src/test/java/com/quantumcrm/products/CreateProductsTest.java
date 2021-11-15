package com.quantumcrm.products;
//Sravani
//sravs
import org.testng.annotations.Test;

import com.quantumcrm.genericLib.BaseTest;
import com.quantumcrm.genericLib.FileLib;
import com.quantumcrm.pages.SignInPage;

public class CreateProductsTest extends BaseTest  {
	@Test
	public void SignInPage() throws Throwable {

	SignInPage sp=new SignInPage();
		FileLib flib=new FileLib();
	
sp.login(flib.readPropertyData(PROP_PATH,"un"),
		flib.readPropertyData(PROP_PATH,"pw"));
}
}