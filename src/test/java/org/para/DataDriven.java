package org.para;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class DataDriven extends BaseClass {
	
	//@DataProvider(name="login")
	public  static Object[][] datas() throws IOException{
		File f = new File("C:\\Users\\Elangovan\\eclipse-workspace\\MavenSample\\src\\test\\resources\\Book1.xlsx");
       FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet("page1");
		Row r = s.getRow(0);
		int pnr = s.getPhysicalNumberOfRows();
		int pnc = r.getPhysicalNumberOfCells();
		
		
		 Object[][] som = new Object[pnr][pnc];
		 String value;
		 for(int i=0; i<pnr ;i++) {
			 Row row = s.getRow(i);
		for(int j=0 ;j<pnc;j++) {
			Cell cell = row.getCell(j);
			int type = cell.getCellType();
			if(type==1) {
				value = cell.getStringCellValue();
			}
			else  {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat ss = new SimpleDateFormat("dd-MM-yyyy");
					value = ss.format(date);
				}
				else {
					double d = cell.getNumericCellValue();
					long l = (long)d;
					 value = String.valueOf(l);
				}
			}
			som[i][j]= value;
		}
		 }
		return som;
		
		
		
}
	
public static void main(String[] args) throws IOException {
	   Object[][] ke = datas();
	   for(Object[] x:ke) {
		   for(Object dd:x) {
			  // System.out.println(dd);
		   }
	   
}
	  

}


}



