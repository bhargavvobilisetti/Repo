package A;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseOverActions2 {
	public WebDriver driver;
	public Actions action;
  @Test
  public void mouse() throws InterruptedException {
	  
	  action = new Actions(driver);
	  
	  WebElement ele = driver.findElement(By.linkText("SwitchTo"));
	  
	  action.moveToElement(ele).build().perform();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.linkText("Windows")).click();
	  
	  
	  //For interactions..
	  
	  
//	  WebElement el1 = driver.findElement(By.linkText("Interactions"));
//	  
//	  action.moveToElement(el1).build().perform();
//	  
//	  WebElement e1 = driver.findElement(By.linkText("Drag and Drop"));
//	  
//	  action.moveToElement(e1).build().perform();
//	  
//	  driver.findElement(By.linkText("Dynamic")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
