package B;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar_Element20 {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  WebElement Element = driver.findElement(By.linkText("Linuxs"));
	  
	  js.executeScript("arguments[0].scrollIntoView();", Element);	
  }
  @BeforeTest
  public void beforeTest() {
	 
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("http://demo.guru99.com/test/guru99home/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
  }
  

}
