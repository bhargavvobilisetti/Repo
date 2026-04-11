package A;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class Screenshot5 {
	public WebDriver driver;
  @Test
  public void shot() throws Exception {
	  driver.findElement(By.id("alertButton")).click();
	  
	  String str = driver.switchTo().alert().getText();
	  
	  System.out.println(str);
	  
	  Thread.sleep(3000);
	  
	  driver.switchTo().alert().accept();
	  
	  String atm = "ap";
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\pics\\"+atm+".png"));
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception{
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }
}
///screenshot another page
//package A;
//
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//import org.testng.annotations.BeforeTest;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.AfterTest;
//
//public class Screenshot {
//	public WebDriver driver;
//  @Test
//  public void shot() throws Exception {
//	  driver.findElement(By.xpath("//a[@href='#Seperate'][contains(.,'Open New Seperate Windows')]")).click();
//	  
//	  driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(.,'click')]")).click();
//	  
//	  String backtoParentwinow = driver.getWindowHandle();
//	  
//	  for(String childwindowhandle : driver.getWindowHandles()) {
//		  
//		  //Switch to Child window 
//		 driver.switchTo().window(childwindowhandle);
//		 
//	  }
//		 
//	  driver.manage().window().maximize();
//	  
//	  String atm = "click";
//	  
//	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//      org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\pics\\"+atm+".png"));
//	  
//      driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();
//      Thread.sleep(3000);
//      
//      driver.switchTo().window(backtoParentwinow);
//      
//      driver.findElement(By.linkText("Home")).click();
//      
//      Thread.sleep(3000);
//  }
//  
//  @BeforeTest
//  public void beforeTest() throws Exception{
//	  WebDriverManager.edgedriver().setup();
//	  driver = new EdgeDriver();
//	  driver.get("http://demo.automationtesting.in/Windows.html");
//	  Thread.sleep(3000);
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }
//
//}
