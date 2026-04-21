package B;

import java.nio.file.spi.FileSystemProvider;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printing_AllConcepts16 {
	public WebDriver driver;
  @Test
  public void click() {
	  List<WebElement> str = driver.findElements(By.tagName("a"));
		System.out.println(str.size());
		
		for(int i=0;i<str.size();i++) {
			if(str.get(i).getText().equalsIgnoreCase("")) {
				System.out.println("Maintaining some gaps in application");
			}
			System.out.println(str.get(i).getText());
		}
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://www.spicejet.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
