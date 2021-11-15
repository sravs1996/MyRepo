package com.quantumcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quantumcrm.genericLib.BaseTest;

public class CustomViewPage {
	@FindBy(xpath="//input[@value='New Contact']") private WebElement newContactBtn;
	@FindBy(xpath="//input[@value='New Campaign']") private WebElement newCampaignBtn;
	public WebElement getNewCampaignBtn() {
		return newCampaignBtn;
	}
	public CustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getNewContactBtn() {
		return newContactBtn;
	}
	public void clicknewContactBtn()
	{
		newContactBtn.click();
	}
	public void clicknewCampaignBtn()
	{
		newCampaignBtn.click();
	}
}