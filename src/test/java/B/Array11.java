package B;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Array11 {
	public WebDriver driver;
  @Test
  public void function() throws InterruptedException {
	  driver.findElement(By.name("q")).sendKeys("selenium web");
		
	  Thread.sleep(3000);
		
	  String str = driver.findElement(By.xpath("(//ul[@role='listbox'])[1]")).getText();
	  Thread.sleep(3000);

	  System.out.println(str);

	  System.out.println(str.length());
		
	  String a[] = str.split("\n");
		
	  System.out.println(a.length);
	  
	  for (int i = 0; i < a.length; i++) {
			
			
			if (a[i].equalsIgnoreCase("selenium webdriver")) {
				driver.findElement(By.name("q")).clear();
			    Thread.sleep(3000);
			    driver.findElement(By.name("q")).sendKeys(a[i]);
			    Thread.sleep(3000);
			    System.out.println(a[i]);
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				break;
			}
			driver.findElement(By.name("q")).clear();
			Thread.sleep(3000);
			driver.findElement(By.name("q")).sendKeys(a[i]);
			Thread.sleep(3000);
		}
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
