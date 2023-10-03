package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AkashSir {
	static WebDriver driver; //globaly declare, static=accecable at any Method
	

	@BeforeClass
	public void enterUrl() 
	{   driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    
	  
	    driver.manage().window().maximize(); 
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test
	public void login() throws InterruptedException
	{
	    System.out.println(driver.getTitle());
	    
	    Thread.sleep(1000);

	    System.out.println(driver.getCurrentUrl());
	    
	}

}
