package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_ND_Drop2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		Actions a=new Actions(driver);


		WebElement ws=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement sp=driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement md=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement os=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement no=driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement st=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sw=driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement cp=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement den=driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement it=driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement rm=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement se=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement ko=driver.findElement(By.xpath("//div[@id='box105']"));


		a.dragAndDrop(ws, usa).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(md, sp).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(os, no).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(st, sw).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(cp, den).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(rm, it).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(se, ko).build().perform();
		Thread.sleep(1000);

		driver.quit();

}}
