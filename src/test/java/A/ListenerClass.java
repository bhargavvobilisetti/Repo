package A;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


public class ListenerClass implements ITestListener{
	
	public void onTestStart(ITestResult result) {  

	    System.out.println("On Start method invoked"); 
	    
		}  
		  
		
		public void onTestSuccess(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Success of test cases and its details are : "+result.getName());  
		}  
		  
		
		public void onTestFailure(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Failure of test cases and its details are : "+result.getName());  
		}  
		  
	 
		public void onTestSkipped(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Skip of test cases and its details are : "+result.getName());  
		}  
		  
		
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Failure of test cases and its details are : "+result.getName());  
		}  
		  
		
		public void onStart(ITestContext context) {  
			
		System.out.println("Start"); 
		}  
		  
		
		public void onFinish(ITestContext context) {  
			
			System.out.println("Final"); 
			
		}  
	

}
