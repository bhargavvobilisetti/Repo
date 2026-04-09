package C;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class Input_Output_StreamsC24 {
	public WebDriver driver;
	public String str;
	
  @Test
  public void data() throws  Exception {
	  
	  FileInputStream fi = new FileInputStream("C:\\Users\\bharg\\Desktop\\Testing\\Programs\\HMS_Data_DrivenLogin.xls");
	  Workbook w = Workbook.getWorkbook(fi);
	  	
	  Sheet s = w.getSheet("MTC");
	 
	  FileOutputStream fo = new FileOutputStream("C:\\Users\\bharg\\Desktop\\Testing\\Programs\\TestData\\JS.xls");
	  WritableWorkbook wb = Workbook.createWorkbook(fo);
	  WritableSheet ws = wb.createSheet("Results", 0);
	  
	  for(int i=1;i<s.getRows();i++) {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		  Thread.sleep(2000);
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(2000);
		  
		  try {
			  driver.findElement(By.xpath("//p[contains(text(),'devi user')]")).click();	
			  driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			  Thread.sleep(3000);
			  str = "Pass";
			  System.out.println(str);
			  
		  }catch(Exception e) {
			  str = "Fail";
			  System.out.println(str);
		  }
		  
		  jxl.write.Label result = new jxl.write.Label(2,i,str);
		  ws.addCell(result);
		  
		  for(int j=0;j<s.getColumns();j++) {
			  System.out.println(s.getCell(j,i).getContents());
			  jxl.write.Label l  =new jxl.write.Label(j,i, s.getCell(j,i).getContents());
			  ws.addCell(l);
		  }
	  }
	  
	  jxl.write.Label un = new jxl.write.Label(0,0,"Username");
	  jxl.write.Label pw = new jxl.write.Label(1,0,"Password");
	  jxl.write.Label rs = new jxl.write.Label(2,0,str);
	  ws.addCell(un);
	  ws.addCell(pw);
	  ws.addCell(rs);
	  
	  wb.write();
	  wb.close();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
