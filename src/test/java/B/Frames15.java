package B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames15 {
	public WebDriver driver;
	public Actions action;
  @Test
  public void frame() throws InterruptedException {
	  
	  // iframe concept
	   driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	   
		// Element which needs to drag.
		WebElement DragFrom = driver.findElement(By.id("draggable"));

		// Element on which need to drop.
		WebElement DropTo = driver.findElement(By.id("droppable"));

		// Using Action class for drag and drop.
		action = new Actions(driver);

		// Dragged and dropped.
		action.dragAndDrop(DragFrom, DropTo).build().perform();
		

		//Back to Out of the frame
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
     
		
		driver.findElement(By.linkText("Demos")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
