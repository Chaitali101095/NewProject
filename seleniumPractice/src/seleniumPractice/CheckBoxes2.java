package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes2 {
public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.tutorialspoint.com/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement c1=driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		
		System.out.println(c1.getAttribute("value"));
		
		c1.click();
		
		System.out.println(c1.isDisplayed());
		System.out.println(c1.isEnabled());
		System.out.println(c1.isSelected());
		
		Thread.sleep(2000);
		
		WebElement c2 =driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		
		System.out.println(c2.getAttribute("value"));
		c2.click();
		
		Thread.sleep(2000);
		
		System.out.println(c2.isDisplayed());
		System.out.println(c2.isEnabled());
		System.out.println(c2.isSelected());
		
        List<WebElement>c = driver.findElements(By.xpath("//input[@name='profession']"));
        for(int i=0;i<c.size();i++);
        {
        	int i = 0;
			c.get(i).click();
		}
		Thread.sleep(2000);
		driver.close();
}}	


