package A;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class PopupWindow3 {
	public WebDriver driver;
  @Test
  public void popup() throws InterruptedException {
	  
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	  Thread.sleep(2000);
	  
	  String btpw = driver.getWindowHandle();
	  
	  for(String ChildWindow : driver.getWindowHandles()) {
		  driver.switchTo().window(ChildWindow);
	  }
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[6]/a/span")).click();
	  Thread.sleep(2000);
	  
	  driver.close();
	  
	  driver.switchTo().window(btpw);
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("Home")).click();
	  
	  Thread.sleep(2000);
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
