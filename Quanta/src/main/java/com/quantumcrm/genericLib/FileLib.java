package com.quantumcrm.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String readExcelData(String excelPath,String sheetName,int row,int cell)throws Throwable
	{
FileInputStream fis=new FileInputStream(excelPath);
 Workbook wb=WorkbookFactory.create(fis);
 String excelValue=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
  return excelValue;
	}
public int getRowCount(String excelPath,String sheetName)throws Throwable
{
FileInputStream fis=new FileInputStream(excelPath);
Workbook wb=WorkbookFactory.create(fis);
int rowCount=wb.getSheet(sheetName).getLastRowNum();
return rowCount;
}
 public void writeExcelData(String excelPath,String sheetName,int row,int cell,String data)throws Throwable
 {
	 FileInputStream fis=new FileInputStream(excelPath);
	 Workbook wb=WorkbookFactory.create(fis);
	 wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
	 FileOutputStream fos=new FileOutputStream(excelPath);
	 wb.write(fos);
	}
	public static String readPropertyData(String propPath,String key)throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String propvalue=prop.getProperty(key,"Incorrect key");
		return propvalue;
	}
	public static String readPropertyData(String propPath, String string, String pageTitle, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

	




