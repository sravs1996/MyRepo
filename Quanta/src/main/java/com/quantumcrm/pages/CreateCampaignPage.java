package com.quantumcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quantumcrm.genericLib.BaseTest;

public class CreateCampaignPage {
	@FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement CampaignNametb;
	@FindBy(xpath="(//input[@name='Button'])[1]") private  WebElement SaveBtn;
	 @FindBy(xpath="(//input[@value='Edit'])[1]") private WebElement EditBtn;
	 @FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement CampaignNametb1;
	   
	@FindBy(xpath="//input[@name='property(Num sent)']") private WebElement Numsenttb;
   @FindBy(xpath="//input[@name='property(Expected Response)']")  private WebElement Expresponsetb;
  
   @FindBy(xpath="(//input[@value='Save & New'])[1]") private WebElement SaveandNewBtn;
   @FindBy(xpath="(//input[@value='Cancel'])[1]") private WebElement CancelBtn;
   @FindBy(xpath="(//input[@value='Clone'])[1]") private WebElement CloneBtn;
  
  
   
   
public WebElement getSaveandNewBtn() {
	return SaveandNewBtn;
}
public WebElement getCancelBtn() {
	return CancelBtn;
}
public WebElement getCampaignNametb() {
	return CampaignNametb;
}
public WebElement getNumsenttb() {
	return Numsenttb;
}
public WebElement getExpresponsetb() {
	return Expresponsetb;
}
public WebElement getSaveBtn() {
	return SaveBtn;
}

public WebElement getCloneBtn() {
	return CloneBtn;
}

public WebElement getEditBtn() {
	return EditBtn;
}
public WebElement getCampaignNametb1() {
	return CampaignNametb1;
}
public CreateCampaignPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}
public void clicknewCampaign(String cn)
{
	CampaignNametb.sendKeys(cn);
	SaveBtn.click();
}
public void clickeditTab(String ecn)
{
	
	EditBtn.click();
	CampaignNametb.clear();
	CampaignNametb1.sendKeys(ecn);
	 SaveBtn.click();
//	 CloneBtn.click();
//	 SaveBtn.click();
	// SaveandNewBtn.click();
	//CancelBtn.click();
	 
}

}

