package A;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class Information_Commands4 {
	public WebDriver driver;
	
  @Test(priority = 1)
  public void gmail() {
	  
	  String g = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(g);
  }
  
  @Test(priority = 2)
  public void search() {
	  
	  String str2 = driver.findElement(By.name("btnK")).getAttribute("value");
	  System.out.println(str2);
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

