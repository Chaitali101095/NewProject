package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_ND_Drop3 {
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		
		WebElement was = driver.findElement(By.xpath("//div[@id= 'box3']"));
		
		Thread.sleep(1000);
		
		WebElement usa = driver.findElement(By.xpath("//div[@id= 'box103']"));
		
		Thread.sleep(2000);
		
		//approach 1
		
		a.clickAndHold(was).build().perform();
		
		a.moveToElement(usa).build().perform();
		
		a.release().build().perform();
		
		//approach 2
		
		WebElement oslo = driver.findElement(By.xpath("//div[@id= 'box1']"));
		
		Thread.sleep(2000);
		
		WebElement norway = driver.findElement(By.xpath("//div[@id= 'box101']"));
		
		Thread.sleep(2000);
		
		a.clickAndHold(oslo).moveToElement(norway).release().build().perform();
		
		Thread.sleep(2000);
		
		//approach 3
		
		WebElement copenhagen = driver.findElement(By.xpath("//div[@id= 'box4']"));
		
		WebElement denmark = driver.findElement(By.xpath("//div[@id= 'box104']"));
		
		Thread.sleep(4000);
		
        a.dragAndDrop(copenhagen, denmark).build().perform();
        
        Thread.sleep(4000);

        driver.close();
		
		


	}


}
