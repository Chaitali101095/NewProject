package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecMyntra {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
						//To launch browser...
		
		driver.get("https://www.myntra.com/ethnic-tops/");
			//to open/launch the url or webpege...
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.manage().window().minimize();
		driver.close();
	}

}
