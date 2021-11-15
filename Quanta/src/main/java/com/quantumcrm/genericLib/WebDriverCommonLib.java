package com.quantumcrm.genericLib;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;


public class WebDriverCommonLib {
	public String getPageTitle()
	{
	String pageTitle=BaseTest.driver.getTitle();
	return pageTitle;
	}
	public void waitForTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(BaseTest.driver,20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void verify(String expected,String actual,String page)
	{
		if(actual.equals(expected))
		{
			System.out.println(page+" is Displayed,PASS");
			}
		else {
			System.out.println(page+ "is not Displayed,FAIL");
			
		}
		}
	public void selectedOption(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectOption(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void selectOption(String text,WebElement element)  {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void switchToFrame(int index)  {
		BaseTest.driver.switchTo().frame(index);
	}
	public void switchToFrame(String value)  {
		BaseTest.driver.switchTo().frame(value);
	}
	public void switchToFrame(WebElement element) {
		BaseTest.driver.switchTo().frame(element);
	}
	public void fullPageScreenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot) BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e)   {
			e.printStackTrace();
		}
	}
	public void getElementScreenshot(WebElement element,String path)  {
		File src=element.getScreenshotAs(OutputType.FILE);
				File dest=new File(path);
		try {
			Files.copy(src, dest);
		} catch(IOException e)   {
			e.printStackTrace();
		}
	}
	public void acceptAlert() {
		BaseTest.driver.switchTo().alert().accept();
	}
	public void dismissAlert() {
		BaseTest.driver.switchTo().alert().dismiss();
	}

 public void scrollToElement(WebElement element) {
	 JavascriptExecutor jse=( JavascriptExecutor)BaseTest.driver;
	 int x=element.getLocation().getX();
	 int y=element.getLocation().getY();
	 int yaxis=y+100;
	 jse.executeScript("window.scrollBy("+x+","+yaxis+")");
 }
	 public void backpage() {
		 BaseTest.driver.navigate().back();
	 }
	 public void forwardpage() {
		 BaseTest.driver.navigate().forward();
	 }
 }

	
		


		
	


