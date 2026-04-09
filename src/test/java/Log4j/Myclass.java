package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myclass {

	public static WebDriver driver;
	
	static Logger log = Logger.getLogger(Myclass.class);
	
	public static void main(String args[]) throws InterruptedException {
		PropertyConfigurator.configure("C:\\Users\\bharg\\Desktop\\Testing\\Programs\\log4j.properties");
		
		WebDriverManager.edgedriver().setup();
		driver =  new EdgeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.browserstack.com/users/sign_in");
		
		log.info("Open browserstack");
		
		driver.manage().window().maximize();
		log.info("Maximize window size");
		
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		log.info("enter username");
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('user_password').value='password';");
		log.info("enter password");
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('user_submit').click();");
		log.info("click on login");
		Thread.sleep(2000);
	}
	
}
