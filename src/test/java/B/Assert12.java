package B;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert12 {
	public WebDriver driver;
  @Test
  public void ass() {
	  String Actualtitle = "Welcome: Mercury Tours";
	  String expectedre = driver.getTitle();
	  //System.out.println(expectedre);
	  Assert.assertEquals(Actualtitle, expectedre);
	  System.out.println("A blog for Software Testers");
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
