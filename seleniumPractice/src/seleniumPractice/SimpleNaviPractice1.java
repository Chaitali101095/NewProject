package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleNaviPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/login");
												
		Thread.sleep(3000); 
		
		driver.manage().window().maximize(); 
		
		System.out.println(driver.getTitle()); 
		
		System.out.println(driver.getCurrentUrl());
									
		driver.navigate().to("https://www.instagram.com/ ");
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		//Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.close();
	
	}

}

