package com.quantumcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quantumcrm.genericLib.BaseTest;

public class CampaignsPage {
	
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement CampaignsTab;
	//@FindBy(xpath="(//a[text()='Edit'])[2]") private WebElement EditBtn;
	//@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement SaveBtn;
	//@FindBy(xpath="(//a[text()='Del'])[1]") private WebElement DelBtn;
	@FindBy(xpath="(//input[@type='checkbox'])[2]") private WebElement Checkbx;
	@FindBy(xpath="//input[@value='Create Task']") private WebElement CreateTaskBtn;
	@FindBy(xpath="//input[@id='subject']") private WebElement Subjecttb;
	@FindBy(xpath="//input[@value='Save']") private WebElement Savebtn;
	@FindBy(xpath="//select[@name='property(status)']") private WebElement  Statusdd;
	@FindBy(xpath="//input[@name='searchString']") private WebElement FindElmnttb;
	@FindBy(xpath="//input[@name='Go']") private WebElement GoBtn;
	@FindBy(xpath="//a[text()='B']") private WebElement Blink;
	public CampaignsPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getCampaignsTab() {
		return CampaignsTab;
	}
//	public WebElement getEditBtn() {
//		return EditBtn;
//	}
//	
//	public WebElement getDelBtn() {
//		return DelBtn;
//	}
	
	public WebElement getCheckbx() {
		return Checkbx;
	}
	
	public WebElement getCreateTaskBtn() {
		return CreateTaskBtn;
	}
	
	public WebElement getSubjecttb() {
		return Subjecttb;
	}
	
	public WebElement getSavebtn() {
		return Savebtn;
	}
	
	public WebElement getStatusdd() {
		return Statusdd;
	}
	public WebElement getFindElmnttb() {
		return FindElmnttb;
	}
	public WebElement getGoBtn() {
		return GoBtn;
	}
	
//	public WebElement getSaveBtn() {
//		return SaveBtn;
//	}
	public void clickCampaignsTab()
	{
		CampaignsTab.click();
		//Blink.click();
		
	//	EditBtn.click();
		//SaveBtn.click();
		//DelBtn.click();
		//Checkbx.click();
		//CreateTaskBtn.click();
		//Subjecttb.sendKeys(sub);
		//Savebtn.click();
		// FindElmnttb.sendKeys(fetb);
		// GoBtn.click();
	}
	
	}	


