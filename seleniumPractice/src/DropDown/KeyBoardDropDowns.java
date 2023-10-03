package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
		name.click();
		name.sendKeys("Chaitali Desai");
		Thread.sleep(2000);
		
		name.sendKeys(Keys.CONTROL+"a");
		name.sendKeys(Keys.CONTROL+"c");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.click();
		lastname.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		
		Thread.sleep(2000);
		
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		
		Thread.sleep(2000);
		
		lastname.sendKeys(Keys.CONTROL+"a");
		lastname.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		
		lastname.sendKeys(Keys.ARROW_UP);
		name.sendKeys(Keys.ARROW_DOWN);
		
		
		
		
		
		

	}

}
