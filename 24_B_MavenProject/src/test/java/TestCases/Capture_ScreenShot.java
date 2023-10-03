package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Capture_ScreenShot {
	@Test
	public void screenshotcapture() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/software-testing-tutorial");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot s=(TakesScreenshot)driver;
		
		File src =s.getScreenshotAs(OutputType.FILE);
		
		//File dest=new File("C:\\Users\\CHAITUKIRAN\\OneDrive\\Desktop\\ScrenShoots\\pic1.png");
		
		File dest=new File("C:\\Users\\CHAITUKIRAN\\OneDrive\\Desktop\\ScrenShoots\\pic2.jpeg");
		FileUtils.copyFile(src, dest);
		
	}

}
