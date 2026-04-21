package B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_verify13 {
	public WebDriver driver;
  @Test
  public void verifying() {
	  String actual = "$398";
	  String expec = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]")).getText();
	  System.out.println(expec);
	  
	  try {
		  Assert.assertEquals(actual, expec);
	  }catch (Throwable r) {
		System.out.println("Not matches");
	}
	 
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
  }

  @AfterTest
  public void afterTest() {
  }

}
