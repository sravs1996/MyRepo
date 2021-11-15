package com.quantumcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quantumcrm.genericLib.BaseTest;
import com.quantumcrm.genericLib.WebDriverCommonLib;

public class CreateContactPage {
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lastNametb;
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lastNametb1;
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lastNametb2;
	@FindBy(xpath="//input[@name='property(First Name)']") private WebElement firstNametb;
	@FindBy(xpath="//select[@name='property(saltName)'") private WebElement nonedd;
	@FindBy(id="Account Name") private WebElement accountnametb;
	@FindBy(xpath="//input[@name='property(Email)']") private WebElement emailtb;
	@FindBy(xpath="//input[@name='property(Department)']") private WebElement departmenttb;
	@FindBy(xpath="//input[@name='property(Home Phone)']") private WebElement homephonetb;
	@FindBy(xpath="//input[@name='property(Fax)']") private WebElement faxtb;
	@FindBy(xpath="//input[@name='property(Asst Phone)']") private WebElement assphonetb;
	@FindBy(xpath="//input[@name='property(Vendor Name)']") private WebElement vendornametb;
	@FindBy(xpath="//input[@name='property(Title)']") private WebElement titletb;
	@FindBy(xpath="//input[@name='property(Phone)']") private WebElement phonetb;
	@FindBy(xpath="//input[@name='property(Other Phone)']") private WebElement otherphonetb;
	@FindBy(xpath="//input[@name='property(Mobile)']") private WebElement mobiletb;
	@FindBy(xpath="//input[@name='property(Assistant)']") private WebElement assistanttb;
	@FindBy(xpath="//input[@name='property(Reports To)']") private WebElement reportstotb;
	@FindBy(id="copyAddress") private WebElement copyaddresslnk;
	@FindBy(xpath="//input[@name='property(Mailing Street)']") private WebElement mailingstreettb;
	@FindBy(xpath="//input[@name='property(Mailing City)']") private WebElement mailingcitytb;
	@FindBy(xpath="//input[@name='property(Mailing State)']") private WebElement mailingstatetb;
	@FindBy(xpath="//input[@name='property(Mailing Zip)']") private WebElement mailingziptb;
	@FindBy(xpath="//input[@name='property(Mailing Country)']") private WebElement mailingcountrytb;
	@FindBy(xpath="//input[@name='property(Other Street)']") private WebElement otherstreettb;
	@FindBy(xpath="//input[@name='property(Other City)']") private WebElement othercitytb;
	@FindBy(xpath="//input[@name='property(Other State)']") private WebElement otherstatetb;
	@FindBy(xpath="//input[@name='property(Other Zip)']") private WebElement otherziptb;
	@FindBy(xpath="//input[@name='property(Other Country)']") private WebElement othercountrytb;
	@FindBy(xpath="//textarea[@name='property(Description)']") private WebElement descriptiontb;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement savebtn;
	@FindBy(xpath="(//input[@value='Save & New'])[1]") private WebElement savenewBtn;
	@FindBy(xpath="(//input[@value='Cancel'])[1]") private WebElement CancelBtn;
	@FindBy(xpath="(//input[@value='Edit'])[1]") private WebElement EditBtn;
	@FindBy(xpath="(//input[@value='Clone'])[1]") private WebElement CloneBtn;
	@FindBy(xpath="(//input[@value='Delete'])[1]") private WebElement DeleteBtn;
	@FindBy(xpath="//input[@name='searchString']") private WebElement FndElmnttf;
	@FindBy(xpath="(//input[@value='Go'])[2]") private WebElement GoBtn;
		public WebElement getLastNametb() {
		return lastNametb;
	}
	public WebElement getFirstNametb() {
		return firstNametb;
	}
	public WebElement getNonedd() {
		return nonedd;
	}
	public WebElement getAccountnametb() {
		return accountnametb;
	}
	public WebElement getEmailtb() {
		return emailtb;
	}
	public WebElement getDepartmenttb() {
		return departmenttb;
	}
	public WebElement getHomephonetb() {
		return homephonetb;
	}
	public WebElement getFaxtb() {
		return faxtb;
	}
	public WebElement getAssphonetb() {
		return assphonetb;
	}
	public WebElement getVendornametb() {
		return vendornametb;
	}
	public WebElement getTitletb() {
		return titletb;
	}
	public WebElement getPhonetb() {
		return phonetb;
	}
	public WebElement getOtherphonetb() {
		return otherphonetb;
	}
	public WebElement getMobiletb() {
		return mobiletb;
	}
	public WebElement getAssistanttb() {
		return assistanttb;
	}
	public WebElement getReportstotb() {
		return reportstotb;
	}
	public WebElement getCopyaddresslnk() {
		return copyaddresslnk;
	}
	public WebElement getMailingstreettb() {
		return mailingstreettb;
	}
	public WebElement getMailingcitytb() {
		return mailingcitytb;
	}
	public WebElement getMailingstatetb() {
		return mailingstatetb;
	}
	public WebElement getMailingziptb() {
		return mailingziptb;
	}
	public WebElement getMailingcountrytb() {
		return mailingcountrytb;
	}
	public WebElement getOtherstreettb() {
		return otherstreettb;
	}
	public WebElement getOthercitytb() {
		return othercitytb;
	}
	public WebElement getOtherstatetb() {
		return otherstatetb;
	}
	public WebElement getOtherziptb() {
		return otherziptb;
	}
	public WebElement getOthercountrytb() {
		return othercountrytb;
	}
	public WebElement getDescriptiontb() {
		return descriptiontb;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
public WebElement getSavenewBtn() {
		return savenewBtn;
	}
public WebElement getLastNametb1() {
		return lastNametb1;
	}

public WebElement getLastNametb2() {
	return lastNametb2;
}
public WebElement getCancelBtn() {
	return CancelBtn;
}

public WebElement getEditBtn() {
	return EditBtn;
}
public WebElement getCloneBtn() {
	return CloneBtn;
}
public WebElement getDeleteBtn() {
	return DeleteBtn;
}

public WebElement getFndElmnttf() {
	return FndElmnttf;
}
public CreateContactPage() {
	PageFactory.initElements(BaseTest.driver,this);
	}
public void lname(String ln,String ln1,String ln2)
{
	 lastNametb.sendKeys(ln);
	 savebtn.click();
	 EditBtn.click();
	 lastNametb.clear();
	 lastNametb1.sendKeys(ln1);
	 
	 savenewBtn.click();
	 lastNametb2.sendKeys(ln2);
	 savebtn.click();
	 CloneBtn.click();
	 CancelBtn.click();
	 
	 BaseTest.driver.navigate().back();
	 BaseTest.driver.navigate().back();
	 BaseTest.driver.navigate().back();
	 BaseTest.driver.navigate().back();
	 BaseTest.driver.navigate().back();
	 
	// WebDriverCommonLib wlib=new WebDriverCommonLib();
// wlib.backpage();
	 FndElmnttf.sendKeys(ln);
	 GoBtn.click();
	 
	// DeleteBtn.click();
	 

}
}



