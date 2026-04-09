package C;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross {
	public WebDriver driver;
  @Test
  @Parameters("browser")
  public void VerifyTitlepage(@Optional("edge")String browserName)
  {

  if(browserName.equalsIgnoreCase("edge"))
  {

  WebDriverManager.edgedriver().setup();
   driver = new EdgeDriver();

  }


  else if (browserName.equalsIgnoreCase("chrome"))
  {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  }


  else if (browserName.equalsIgnoreCase("IE"))
  {
  WebDriverManager.iedriver().setup();
  driver = new InternetExplorerDriver();

  }

  else if (browserName.equalsIgnoreCase("Safari"))
  {
  WebDriverManager.safaridriver().setup();
  driver = new SafariDriver();

  }

  }
}
