package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverOperations {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement mouseover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		//first creat object for action class
		Actions a=new Actions(driver); //obj  argumnt give which taken above
		Thread.sleep(2000);
		a.moveToElement(mouseover).build().perform(); //we named above already'mouseover'
		//WebElement top=driver.findElement(By.xpath("//a[@href='#top']"));
		//top.click();
		WebElement reload=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
		reload.click();
		Thread.sleep(2000);
		
		
		
		 
	
	}
}
