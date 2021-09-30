package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable 
{
	
	
	   @Before
	   public void before(Scenario scenario) throws UnknownHostException
	   {
		   HTMLReportGenerator.TestSuiteStart("Desktop\\JAVA\\Different types of program", "Flipkart");                           //"D:\\report\\flipkart.html"
		   
		   HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		   
		   System.out.println("--------------------------------Scenario start----------------------------------------");
	   }
	
	
	
	
	
       @After
	   public void after(Scenario scenario)
	   {
		   System.out.println("--------------------------------Scenario end----------------------------------------");
		   
		   HTMLReportGenerator.TestCaseEnd();
		   HTMLReportGenerator.TestSuiteEnd();
	   }
	
	
	
	
	
	
	

}
