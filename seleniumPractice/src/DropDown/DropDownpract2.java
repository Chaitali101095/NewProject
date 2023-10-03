package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownpract2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement country=driver.findElement(By.xpath("//span[@id='ct100_mainContent_dd1_originStation1_CTXTaction']"));
		country.click();
		//country.sendKeys("India");
		Thread.sleep(2000);
		
		WebElement bang=driver.findElement(By.xpath("//a[@value='BLR']"));
		bang.click();
		Thread.sleep(2000);
		
		WebElement jai=driver.findElement(By.xpath("//a[@value='JAI'][2]"));
		jai.click();
		
		//WebElement arrivalcity=driver.findElement(By.xpath("//a[@value='DEL'][1]"));
		//arrivalcity.click();
		
		
		//input[@id='autosuggest']
	}}