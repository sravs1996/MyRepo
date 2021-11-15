package com.quantumcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quantumcrm.genericLib.BaseTest;
import com.quantumcrm.genericLib.WebDriverCommonLib;

public class NewPotentialPage {
	
	
	@FindBy(xpath="//input[@value='New Potential']") private WebElement NewPotentialBtn;
	@FindBy(xpath="//input[@name='property(Potential Name)']") private WebElement PotentialNametb;
	@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement AccountNametb;
	@FindBy(xpath="//select[@name='property(Stage)']") private WebElement Stagetb;
	@FindBy(xpath="//input[@name='property(Closing Date)']") private WebElement ClosingDatetb;
	@FindBy(xpath="(//input[@value='Save'])[2]") private WebElement SaveBtn;
	@FindBy(xpath="(//input[@value='Save & New'])[1]") private WebElement SaveandNewBtn;
	
	public NewPotentialPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getNewPotentialBtn() {
		return NewPotentialBtn;
	}
	
	public WebElement getPotentialNametb() {
		return PotentialNametb;
	}
	public WebElement getAccountNametb() {
		return AccountNametb;
	}
	public WebElement getStagetb() {
		return Stagetb;
	}
	public WebElement getClosingDatetb() {
		return ClosingDatetb;
	}
	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	public WebElement getSaveandNewBtn() {
		return SaveandNewBtn;
	}
	
	public void clicknewpotential(String ptname,String accname,String date) throws Throwable  
	{
		 NewPotentialBtn.click();
 PotentialNametb.sendKeys(ptname);
		AccountNametb.sendKeys(accname);
		ClosingDatetb.sendKeys(date);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.selectOption("Qualification",Stagetb);
		Thread.sleep(1000);
		SaveBtn.click();
		
	}
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


