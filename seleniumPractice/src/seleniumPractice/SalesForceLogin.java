package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		WebElement e=driver.findElement(By.id("username"));
		e.click();
		e.sendKeys("Chaitali Desai");
		
		WebElement e1=driver.findElement(By.className("password"));
		e1.click();
		e1.sendKeys("chaitali");
		
		Thread.sleep(3000);
		
		WebElement e2=driver.findElement(By.className("Login"));
		e2.click();
		Thread.sleep(3000);
		driver.quit();	
		
	}

}
