package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstselectOption6 {
	public WebDriver driver;
  @Test
  public void Option() {
	 WebElement ele = new Select(driver.findElement(By.name("country"))).getFirstSelectedOption();
	 System.out.println(ele.getText());
	 
	 if(ele.getText().equalsIgnoreCase("ALBANIA")) {
		 System.out.println("it is matche");
	 }
	 else {
		 System.out.println("it doesn't matches ");
	 }
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
