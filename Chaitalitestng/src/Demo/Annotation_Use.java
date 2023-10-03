package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Use {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this code will excecute Before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("this code will excecute After every Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this code will excecute Before every @Test Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this code will excecute After every @Test Method");
	}
	
	@Test
	public void M1()
	{
		System.out.println("this is First Method");
	}
	
	@Test
	public void M2()
	{
		System.out.println("this is Second method");
	}
	
	@Test
	public void M3()
	{
		System.out.println("this is Third method");
	}

	
	

}
