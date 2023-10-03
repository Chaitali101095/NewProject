package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTechniques {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();  //Launch Browser
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@type='email']"));
		username.click();
		username.sendKeys("Chaitali");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.click();
		password.sendKeys("Chaitali@123");
		
		
		
		
		
		
		
	}

}
