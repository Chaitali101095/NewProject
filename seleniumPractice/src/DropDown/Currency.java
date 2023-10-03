package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Currency {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
WebElement usa=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		usa.click();
		Thread.sleep(2000);
		
		Select c=new Select(usa);
		c.selectByIndex(3);
		 
		
		
		}
	}



