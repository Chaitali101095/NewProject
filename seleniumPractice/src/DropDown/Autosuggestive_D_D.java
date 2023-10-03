package DropDown;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_D_D {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	WebElement e=driver.findElement(By.xpath("//input[@id='autosuggest']"));
	e.click();
	Thread.sleep(2000);
	e.sendKeys("india");  //e.sendKet("ind")
			
	Thread.sleep(2000);
	e.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	e.sendKeys(Keys.ARROW_DOWN);
	e.click();
	e.sendKeys(Keys.ENTER);
			
	List<WebElement> e1=driver.findElements(By.xpath("//li[@class='ui-menu-item'][2]"));
	for(int i=0;i<e1.size();i++);
	{
 	 int i= 0;
	System.out.println(e1.get(i).getText());
	{if(e1.get(i).getText().equalsIgnoreCase("india"));
	e1.get(i).click(); 
	}
	}} 
	}
