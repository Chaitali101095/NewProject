package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	   WebElement link1=driver.findElement(By.linkText("Forgot Your Password?"));
		//link1.click();
		System.out.println(link1.isDisplayed()); //verify presentof link on ui
		System.out.println(link1.isEnabled());  //verify link is ready to accept command
												//clickable or not
		System.out.println(link1.getText());  
		
		WebElement link2=driver.findElement(By.partialLinkText("Use Custom"));
		//link2.click();
		System.out.println(link2.isDisplayed());
		System.out.println(link2.isEnabled());
		System.out.println(link2.getText());
		
		WebElement link3=driver.findElement(By.linkText("Try for Free"));//only 1 optn selected
		//link3.click();
		System.out.println(link3.isDisplayed());
		System.out.println(link3.isEnabled());
		System.out.println(link3.getText());
		
		WebElement link4=driver.findElement(By.partialLinkText("Privacy"));
		//link4.click();
		System.out.println(link4.isDisplayed());
		System.out.println(link4.isEnabled());
		System.out.println(link4.getText());
		
		driver.quit();
		
		
	}
}