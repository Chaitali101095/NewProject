package DropDown;
	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class HandlingDropDownList {
		public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		driver.manage().window().maximize();
			
		Thread.sleep(2000);
			
		WebElement continents=driver.findElement(By.xpath("//select[@name='continents']"));
			
		//continents.click();
			
		Select s=new Select(continents); //'select'is className & 's' is objectName
			
		s.selectByIndex(2);		//1st Approach
			
		//Thread.sleep(2000);
			
		s.selectByVisibleText("Antartica"); //no need to object,type spell. as in given option 
									//2nd Approach
		List<WebElement> e=s.getOptions();
		for(int i=0;i<e.size();i++)
		{ 
		  System.out.println(e.get(i).getText());	//2nd Appro.for each loop
		  
		}
		{System.out.println();
		  for(WebElement k:e)
		  {System.out.println(k.getText());
		}
	}
	}
		
	}

	

