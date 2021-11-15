package com.quantumcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quantumcrm.genericLib.BaseTest;

public class PotentialPage {
	@FindBy(xpath="//a[text()='Potentials']") private WebElement PotentialsTab;
 public PotentialPage()
 {
	 PageFactory.initElements(BaseTest.driver,this);
 }
public WebElement getPotentialsTab() {
	return PotentialsTab;
}
 public void clickPotentialsTab()
 {
	 PotentialsTab.click(); 
 }
}
