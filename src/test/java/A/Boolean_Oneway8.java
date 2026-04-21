package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Boolean_Oneway8 {
	public WebDriver driver;
	
  @Test
  public void Options() throws InterruptedException {
	  driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).click();
	  Thread.sleep(3000);
	  
	  boolean printcondition = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).isDisplayed();
	  System.out.println(printcondition);
	  
	  WebElement ele1 = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]"));
	  
	  if (ele1.isEnabled()) {
			
			System.out.println("Round trip is tere passed");
			
		} else {
			
			System.out.println("No Not available");

		}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://savaari.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
