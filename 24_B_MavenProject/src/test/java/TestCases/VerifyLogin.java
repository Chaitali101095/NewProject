package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.BaseClass;

public class VerifyLogin extends BaseClass {
	
	@Test
	public void login() throws IOException, InterruptedException
	{
	  driverInitialize();
	  
	  Thread.sleep(1000);
	  
	  driver.get("https://login.salesforce.com/?locale=in");
		
	  Thread.sleep(2000);
	  
	  WebElement UN=driver.findElement(By.xpath("//input[@id='username']"));
	  UN.sendKeys("Chaitali123@gmail.com");
	  
	  WebElement PWD=driver.findElement(By.xpath("//input[@id='password']"));
	  PWD.sendKeys("Desai#123");
	  
	  WebElement loginButton=driver.findElement(By.xpath("//input[@id='Login']"));
	  loginButton.click();
	  
	}

}
