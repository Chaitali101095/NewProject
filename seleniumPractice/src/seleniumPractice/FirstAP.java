package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAP {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//to launch the browser
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		driver.close();
		
		}
}
