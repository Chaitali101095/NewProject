package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRadioButtons {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement f=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
		System.out.println(f.isDisplayed());
		System.out.println(f.isEnabled());
		System.out.println(f.isSelected());
		f.click();
		
		System.out.println();
	
		WebElement g=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
		System.out.println(g.isDisplayed());
		System.out.println(g.isEnabled());
		System.out.println(g.isSelected());
		g.click();
		 
		System.out.println();
		
        WebElement h=driver.findElement(By.xpath("//input[@id=' ctl00_mainContent_chk_IndArm']"));
        System.out.println(h.isDisplayed());
		System.out.println(h.isEnabled());
		System.out.println(h.isSelected());
		h.click();
		
		System.out.println();
		WebElement i=driver.findElement(By.xpath (" //input[@id='ctl00_mainContent_chk_StudentDiscount']"));  
		System.out.println(i.isDisplayed());
		System.out.println(i.isEnabled());
		System.out.println(i.isSelected());
		i.click();
		
		System.out.println();
		WebElement j=driver.findElement(By.xpath(" //input[@id='ctl00_mainContent_chk_Unmr']"));
		System.out.println(j.isDisplayed());
		System.out.println(j.isEnabled());
		System.out.println(j.isSelected());				 
		j.click();
		
		System.out.println();
		WebElement Asist =driver.findElement(By.partialLinkText("Spec"));
		Thread.sleep(2000);
		System.out.println(Asist.getTagName());
		System.out.println();
		
		Asist.click();
		
		driver.close();
		

	}}
