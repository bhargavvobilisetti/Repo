package A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionValidation7 {
	public WebDriver driver;
  @Test
  public void validation() {
	  List<WebElement> allvalues = new Select(driver.findElement(By.name("country"))).getOptions();
	  //System.out.println(allvalues.get(50).getText());
	  
	  for(WebElement option: allvalues) {
		  if(option.getText().contains("")) {
			  System.out.println("It matches "+option.getText());
			  break;
		  }
	  }

	  
// but prints for every element 
//	  for(int i=0;i<allvalues.size();i++) {
//		  //System.out.println(allvalues.get(i).getText());
//		  if(allvalues.get(i).getText().contains("UGANDA")) {
//			  System.out.println(allvalues.get(i).getText());
//			  System.out.println("UGANDA");
//		  }
//		  else {
//			  System.out.println("Not matches");
//		  }
//	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
