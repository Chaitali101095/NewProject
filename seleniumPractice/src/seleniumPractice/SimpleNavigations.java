package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleNavigations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
												//open or enter url
		Thread.sleep(3000); //pause
		
		driver.manage().window().maximize(); //to maximize webpage
		
		System.out.println(driver.getTitle()); //to retrive the title
		
		System.out.println(driver.getCurrentUrl());
									//to retrive current url
		driver.navigate().to(" https://www.facebook.com/login.php");
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
