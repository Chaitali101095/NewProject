package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
		
		WebElement continents=driver.findElement(By.xpath("//select[@name='continent']"));
		//Continent.click();
		
		Select s=new Select(continents);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByVisibleText("Antartica"); 
		
	  List<WebElement> elements=s.getOptions();
		for(int i=0;i<elements.size();i++)
		{System.out.println(elements.get(i).getText());
		}
		
		System.out.println('a');	//2nd approach 4 print all options
		
		for(WebElement k:elements)
		{System.out.println(k.getText());
		
		}
		}
}

