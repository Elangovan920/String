package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.baseclass.BaseClass;
import org.testng.annotations.Test;

public class Page1 extends BaseClass{
	
	
	@Test
	private void testss() throws IOException {
		File f = new File("C:\\Users\\Elangovan\\eclipse-workspace\\TestNgs\\src\\test\\resources\\Book1.xlsx");
	     FileInputStream f1= new FileInputStream(f);
	     Workbook w = new XSSFWorkbook(f1);
	     Sheet s = w.getSheet("page1");
	     Row r = s.getRow(1);
	     Cell cell = r.getCell(1);
	     int ct = cell.getCellType();
	     String value= null;
	     if(ct==1) {
	    	 value = cell.getStringCellValue();
	     }
	     else {
	    	 if(DateUtil.isCellDateFormatted(cell)) {
	    		 Date dd = cell.getDateCellValue();
	    		 SimpleDateFormat ss=new SimpleDateFormat("dd-MM-yyyy");
	    		 value = ss.format(dd);
	    	 }
	    	 else {
	    		 double dd = cell.getNumericCellValue();
	    		 long l = (long)dd;
	    		  value =  String.valueOf(l);
	    	 }
	     }
	     
	     String value1= null;
	    for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
	    	Row re=s.getRow(i);
	    	for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
	    	 Cell cells=re.getCell(j);
	    	 //System.out.println(cells);
	    	 int ct1 = cells.getCellType();
		     
		     if(ct1==1) {
		    	 value1 = cells.getStringCellValue();
		    	 System.out.println(value1);
		     }
		     
		     else {
		    	 if(DateUtil.isCellDateFormatted(cells)) {
		    		 Date dd1 = cells.getDateCellValue();
		    		 SimpleDateFormat ss=new SimpleDateFormat("dd-MM-yyyy");
		    		 value1 = ss.format(dd1);
		    		 System.out.println(value1);
		    	 }
		    	 else {
		    		 double dd = cells.getNumericCellValue();
		    		 long l2 = (long)dd;
		    		  value1 =  String.valueOf(l2);
		    		  System.out.println(value1);
		    	 }
		     }
	    	}
	    	 //System.out.println(value1);	
	}
	    //System.out.println(value);	
	   
	    
}}		
    		
    	
    
    
    

