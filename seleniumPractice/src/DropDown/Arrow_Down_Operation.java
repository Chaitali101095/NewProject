package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrow_Down_Operation {
	public static void main(String[]args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
			driver.manage().window().maximize();
			
			WebElement d=driver.findElement (By.xpath("//input[@id='autosuggest']"));
					d.sendKeys("ind");
					Thread.sleep(2000);
					
					/*d.sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(3000);
					d.sendKeys(Keys.ENTER); */
					
	List<WebElement> f=driver.findElements(By.xpath("//a[@class='ui-corner-akk']"));
	 
	for(int i=0; i<f.size();i++)
	{
		System.out.println(f.get(i).getText());
	      {if(f.get(i).getText().equalsIgnoreCase("india"));
	        { 
	          f.get(i).click();
	        }
	}
	}
	{ 
	}
		
					
					
			
			
	}
	

}
