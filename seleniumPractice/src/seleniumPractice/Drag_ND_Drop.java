package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_ND_Drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
		
		a.dragAndDrop(e,e1).build().perform();
		Thread.sleep(2000);
		
		
WebElement e2=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		
		WebElement e3=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		
		a.dragAndDrop(e2,e3).build().perform();
		Thread.sleep(2000);
		
WebElement e4=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		
		WebElement e5=driver.findElement(By.xpath("//*[@id=\"box101\"]"));
		
		a.dragAndDrop(e4,e5).build().perform();
		Thread.sleep(2000);
		
		
WebElement e6=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		
		WebElement e7=driver.findElement(By.xpath("//*[@id=\"capitals\"]"));
		
		a.dragAndDrop(e6,e7).build().perform();
		
		Thread.sleep(2000);

WebElement e8=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		
		WebElement e9=driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		
		a.dragAndDrop(e8,e9).build().perform();
		Thread.sleep(2000);
		driver.close();
  
	}


}
