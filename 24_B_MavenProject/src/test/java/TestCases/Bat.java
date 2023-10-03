package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bat {
	@Test
	public void launchBrower()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
	}

}
