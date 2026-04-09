package B;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class DataDriven_18 {
	public WebDriver driver;
  @Test
  public void data() throws BiffException, IOException, InterruptedException {
	  FileInputStream fi = new FileInputStream("C:\\Users\\bharg\\Desktop\\Testing\\AQB.xls");
	  Workbook wb = Workbook.getWorkbook(fi);
	  Sheet s = wb.getSheet("Raju");
	  
	  driver.findElement(By.id("login_field")).sendKeys(s.getCell(0,1).getContents());
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("password")).sendKeys(s.getCell(1,1).getContents());
	  Thread.sleep(5000);
	  
	  driver.findElement(By.name("commit")).click();
	  
	  
  }
  @BeforeTest
  
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://github.com/login?return_to=%2Flogins");
  }

  @AfterTest
  public void afterTest() {
  }

}
