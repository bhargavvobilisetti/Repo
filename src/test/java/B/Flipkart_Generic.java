package B;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Flipkart_Generic {
	public WebDriver driver;
	
	public void generic(String str) throws InterruptedException {
		driver.findElement(By.xpath(str)).click();
		Thread.sleep(2000);
	}
  @Test
  public void clickable() throws InterruptedException {
	  for (int i = 1; i <= 14 ; i++) {
		  generic("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[\"+i+\"]/div/div/div/a/div/div");
		//*[@id="container"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[1]
		//*[@id="container"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/a/div/div
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  //driver.get("https://www.flipkart.com/?pageUID=1773461471572");
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  //driver.findElement(By.xpath("/html/body/div[5]/div/span")).click();
	  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	  driver.manage().deleteAllCookies();
  }

  @AfterTest
  public void afterTest() {
  }

}
