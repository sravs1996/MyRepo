package com.quantumcrm.genericLib; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest implements IAutoConsts {

		public static WebDriver driver;
		
		@BeforeClass
		public void openBrowser() throws Throwable
		{
			FileLib flib=new FileLib();
		String browserValue=flib.readPropertyData(PROP_PATH, "browser");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();	
		}
		else {
			System.out.println("Enter Proper Browser name");
		}
		driver.manage().window().maximize();
		String appUrl=flib.readPropertyData(PROP_PATH,"url");
		driver.get(appUrl);
		Thread.sleep(2000);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(flib.readPropertyData(PROP_PATH,"loginTitle"),wlib.getPageTitle(),"loginTitle");
		
		}
		@AfterClass(enabled=false)
		public void closeBrowser()
		{
			driver.quit();
		}
		}

	
	

