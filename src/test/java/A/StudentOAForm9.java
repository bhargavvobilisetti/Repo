package A;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentOAForm9 {
	public WebDriver driver;
	
	  @Test
	  public void form() throws Exception {
		  
		  
		  //Enter First Name
		  driver.findElement(By.id("firstName")).sendKeys("H");
		  Thread.sleep(3000);
		  
		  //Enter Last Name
		  driver.findElement(By.id("lastName")).sendKeys("ri");
		  Thread.sleep(3000);
		  
		  //Enter Email id
		  driver.findElement(By.id("userEmail")).sendKeys("tha@gmail.com");
		  Thread.sleep(3000);
		  
		  //Select Gender
		  driver.findElement(By.id("gender-radio-2")).click();
		  Thread.sleep(3000);
		  
		  //Enter Mobile number
		  driver.findElement(By.id("userNumber")).sendKeys("99998");
		  Thread.sleep(3000);
		  
		  //Select Date of Birth
		  
		  //Click Date of Birth
		  driver.findElement(By.id("dateOfBirthInput")).click();
		  
		  //Select Month
		  //new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[1]/div/div[1]/select"))).selectByVisibleText("June");
		  new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("June");

		  //Select Year
		  //new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/select"))).selectByVisibleText("June");
		  new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("2003");
		  
		  //Select Date
		  //driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[7]")).click();
		  driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, June 21st, 2003']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.id("subjectsInput")).sendKeys("English");
		  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  
		  //Select Hobbies
		  driver.findElement(By.id("hobbies-checkbox-1")).click();
		  driver.findElement(By.id("hobbies-checkbox-3")).click();
		  Thread.sleep(3000);
		  
		  //Drag and drop file
		  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\user\\Desktop\\Testing\\automation.png");
		  Thread.sleep(3000);
		  
		  //Enter Current Address
		  driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
	//Sending the cursor from Current Address to State
		  driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
		  
		  // dropdown list is shown then write ncr 
		  driver.switchTo().activeElement().sendKeys("NCR");
		  
		  //if we click tab here ncr gets selected and written in state column
		  driver.switchTo().activeElement().sendKeys(Keys.TAB);
		  
		  //this tab function is to send cursor from state to city column
		  driver.switchTo().activeElement().sendKeys(Keys.TAB);
		  Thread.sleep(3000);
		  
		  //Dropdown list is shown then write delhi
		  driver.switchTo().activeElement().sendKeys("Delhi");

		  // click tab here to place the delhi from dropdown to place it in the column 
		  driver.switchTo().activeElement().sendKeys(Keys.TAB);
		  
		  // tab is to send cursor to submit
		  driver.switchTo().activeElement().sendKeys(Keys.TAB);
		  Thread.sleep(3000);
		  
		  //Submit
		  driver.findElement(By.id("submit")).click();
		  Thread.sleep(5000);
		  
		  //Close button after successfully getting registered
		  driver.findElement(By.id("closeLargeModal")).click();
		  Thread.sleep(3000);
		  
	  }
	  
	  
	  @BeforeTest
	  public void openurl() throws Exception {
		  
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  	driver.get("https://demoqa.com/automation-practice-form");
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  
	  }

	  
	  @AfterTest
	  public void afterTest() {
	  }
}


