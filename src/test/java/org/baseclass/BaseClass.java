package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.SelectChannelEndPoint;

import com.sun.glass.events.KeyEvent;

public class BaseClass {

	public static WebDriver driver ;
	
	public static void browserLaunch(String browser ) {
	   if(browser.equalsIgnoreCase("chrome")) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\TestNgs\\src\\test\\resources\\chromedriver.exe");
			 driver = new ChromeDriver();
	   }
	   else if(browser.equalsIgnoreCase("firefox")) {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\MavenSample\\Driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	   }
	   else if(browser.equalsIgnoreCase("edge")) {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\MavenSample\\Driver\\msedgedriver.exe");
		  driver = new EdgeDriver();
	   }
	
	}
	public static  void implicityWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS );
		}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static  void urlLaunch(String url) {
		driver.get(url);

	}
	public static void click(WebElement wb ) {
		wb.click();
		}
	public static  void  sendKeys(WebElement a ,String d) {
		a.sendKeys(d);
		}
	public static File elementScreenshot(WebElement a,String r) throws IOException {
		File src = a.getScreenshotAs(OutputType.FILE);
		 File des = new File (r);
		FileUtils.copyFile(src, des);
		return des;
		 
      }
      public static File screenShot(String a) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		 File des = new File (a);
		 FileUtils.copyFile(src, des);
		return des;
	}
     public static void staticWait(int sec) throws InterruptedException {
		Thread.sleep(sec);

	}
     public static void keyBoard(String event ) throws AWTException {
    	 if(event.equalsIgnoreCase("enter")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_ENTER);
    		 r.keyRelease(KeyEvent.VK_ENTER);
    	 }
    	 else if (event.equalsIgnoreCase("copy")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_C);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_C);
    	 }
    	 else if(event.equalsIgnoreCase("paste")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_V);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_V);
    	 }
    	 else if(event.equalsIgnoreCase("select")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_A);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_A);
    	 }
    	 else if(event.equalsIgnoreCase("clear")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_BACKSPACE);
    		 r.keyRelease(KeyEvent.VK_BACKSPACE);
    		 
    	 }
    	 else if(event.equalsIgnoreCase("right")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_RIGHT);
    		 r.keyRelease(KeyEvent.VK_RIGHT);
    		 
    	 }
    	 else if(event.equalsIgnoreCase("tab")) {
    		 Robot r = new Robot();
    		 r.keyPress(KeyEvent.VK_TAB);
    		 r.keyRelease(KeyEvent.VK_TAB);
    	 }
    	 
    	 }
     public static void selectby(WebElement a,int b) {
    	 
	 Select s = new Select(a);
	 s.selectByIndex(b);
     }
    	 public static  void selectbyValue(WebElement a,String d) {
    		 Select s = new Select(a);
    		 s.selectByValue(d);
		}
    	
    		public static String getText(WebElement a) {
				return a.getAttribute("value");
			}
    	 
          public static String currentUrl() {
        	  return driver.getCurrentUrl();
          }
          
          public static void javascript(String actiontoperform,WebElement webele) {
        	if(actiontoperform.equalsIgnoreCase("scrolldown")) {
        	JavascriptExecutor j = (JavascriptExecutor)driver ;
			j.executeScript("arguments[0].scrollIntoView(true)", webele);
		}
        	else if(actiontoperform.equalsIgnoreCase("click")) {
        	  JavascriptExecutor j = (JavascriptExecutor)driver ;
        	  j.executeScript("arguments[0].click()", webele);
          }
        	else if(actiontoperform.equalsIgnoreCase("scrollup")) {
        		JavascriptExecutor j = (JavascriptExecutor)driver ;
    			j.executeScript("arguments[0].scrollIntoView(false)", webele);
        	}
        	
    	 
          } 
          public static String javascripttext(WebElement webele){
      		JavascriptExecutor j = (JavascriptExecutor)driver ;
  			j.executeScript("arguments[0].setAttribute('value','elango@gmail.com')", webele);
			return null;
      	}
          
        
		public static void mouseAction(String action,WebElement element) {
			Actions a= new Actions(driver);
        if(action.equalsIgnoreCase("click")) {
        	a.click(element);
        	 }
        else if(action.equalsIgnoreCase("contextclick")) {
        	a.contextClick(element);
        }
        else if(action.equalsIgnoreCase("movetoelement")) {
        	a.moveToElement(element);
        }
        else if(action.equalsIgnoreCase("doubleclick")) {
        	a.doubleClick(element);
        }
        
        
         }
		public static void draganddrop(WebElement source,WebElement destination) {
			Actions a= new Actions(driver);
			a.dragAndDrop(source, destination);

		}
	public static String check(WebElement element) {
		element.isSelected();
		return null;

	}

public static String excel(int rowno,int colno) throws IOException {
	File f = new File("C:\\Users\\Elangovan\\eclipse-workspace\\MavenSample\\src\\test\\resources\\Book1.xlsx");
    FileInputStream fi = new FileInputStream(f);
    Workbook wb = new XSSFWorkbook(fi);
    Sheet s = wb.getSheet("page1");
   System.out.println( s.getPhysicalNumberOfRows()); 
    Row r = s.getRow(rowno);
   // System.out.println(r);
    System.out.println(r.getPhysicalNumberOfCells());
    Cell c = r.getCell(colno);
  
    
    
    		
    		int ct = c.getCellType();
    		String value = null ;
    	if(ct==1) {
    		 value = c.getStringCellValue();
    		//System.out.println(value);
    	}
    	
    	else {
    		if(DateUtil.isCellDateFormatted(c)) {
    			Date dc = c.getDateCellValue();
    			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yy");
    			value = sd.format(dc);
    			//System.out.println(value);
    		}
    		else {
    			double db = c.getNumericCellValue();
    			long l = (long)db;
    			 value = String.valueOf(l);
    			//System.out.println(valueOf);
    		}
    		
    		
    	}
		return value;
	
    	
}










}

