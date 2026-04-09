package A;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

@Listeners(A.ListenerClass.class)
public class Alerts {
	public WebDriver driver;
  @Test
  public void alert() {
	  
	  driver.findElement(By.id("alertButton")).click();
	  
	  //driver.findElement(By.id("timerAlertButton")).click();
	  String tr = driver.switchTo().alert().getText();
	  System.out.println(tr);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();
	  driver.get("https://demoqa.com/alerts");
	  Thread.sleep(4000);
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
