package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileData 
{
   public String getExcelData(String sheetno,int rownum,int colnum) throws Throwable
   {
	FileInputStream fis = new FileInputStream("./TestData/Test.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetno);
	Row rw= sh.getRow(rownum);
	Cell cl= rw.getCell(colnum);
	   String data=cl.getStringCellValue();
	   return data;
   }
   
   
   
   public Properties getProperties() throws Throwable
   {
	   FileInputStream fis = new FileInputStream("./TestData/Config.properties");
	   Properties pobj = new Properties();
	   pobj.load(fis);
	   return pobj;
   }
}
