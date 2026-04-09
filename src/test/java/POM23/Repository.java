package POM23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Repository {
	public static WebDriver driver;
	
	public static void login() throws InterruptedException {
		driver.findElement(Locators.username).sendKeys(TestData.username);
		
		driver.findElement(Locators.passowrd).sendKeys(TestData.password);
		
		driver.findElement(Locators.sign).click();
		Thread.sleep(5000);
		
	}
	
	public static void alerts() {
		driver.switchTo().alert().accept();
	}
	
	public static void popupwins() {
		String winhandle = driver.getWindowHandle();
		
		driver.switchTo().window(winhandle);
	}
	
	@BeforeTest
	//setup
	public static void setup() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(TestData.url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );	
	}
	
}
