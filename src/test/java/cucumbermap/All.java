package cucumbermap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class All 
{
	public static void main(String[] args)
	{
		
		 System.setProperty("webdriver.chrome.driver","D:\\Morning 8.30am batch(indra)\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe");			
			ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
	 
		  driver.get("https://www.flipkart.com/");
		  
		  driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		  
		  Actions act=new Actions(driver);
		  
		  WebElement move=driver.findElementByXPath("//a[normalize-space()='Login']");		
		
		  
		  act.moveToElement(move).build().perform();
		  
	   
	      driver.findElementByXPath("//input[@class='_2IX_2- VJZDxU']").sendKeys("9168313434");
	      
	      driver.findElementByXPath("//input[@type='password']").sendKeys("DDDD@1234");
	      
	      driver.findElementByXPath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
	      
	      
	
	
	}

}
