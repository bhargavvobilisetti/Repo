package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(A.ListenerClass.class)
public class ListernerDemo {
	public WebDriver driver;
  @Test(priority = 1)
  public void login() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  System.out.println("Passed test case");
	  Assert.assertTrue(true);
  }
  
  @Test(priority = 2)
  public void testfail() {
	  System.out.println("failed test case");
	  Assert.assertTrue(false);
  }
  
  @Test(priority = 3)
  public void testskipped() {
	  System.out.println("skipped test case");
	  throw new SkipException("skip exception throw...");
  }
}
