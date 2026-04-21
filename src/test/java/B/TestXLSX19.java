package B;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestXLSX19 {
	public WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  File src = new File("D:\\Personal_swamykumar\\Test Data\\Bonnis.xlsx");
      
	     // Load the file
	     FileInputStream finput = new FileInputStream(src);
	      
	     //XSSFWorkbook is a Syntax for .XLSX to Load the workbook
	     XSSFWorkbook workbook = new XSSFWorkbook(finput);
	     
	     // XSSFSheet is a Syntax for Load the sheet in which data is stored
	     XSSFSheet s = workbook.getSheetAt(0);
	     
		String username = s.getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		
		driver.findElement(By.id("login_field")).sendKeys(username);
		
		Thread.sleep(3000);

		String password = s.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(password);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		
		driver.findElement(By.name("commit")).click();
		Thread.sleep(10000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://github.com/login?return_to=%2Flogins");
		Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
