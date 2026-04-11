package POM23;

import org.testng.annotations.Test;

public class TestCasesExecution extends Repository{

	@Test
	public static void alltests() throws InterruptedException {
		
		Repository.login();
		
		Repository.alerts();
		
		Repository.popupwins();
	}
	
	
}
