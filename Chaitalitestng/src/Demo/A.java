package Demo;

import org.testng.annotations.Test;

public class A{
	
	@Test(groups = "regression")
	public void M1()
	{
	  System.out.println("i am method m1");
	}
	
	@Test(groups = "smoke")
	public void M2()
	{
		System.out.println("i am method m2");
		
	}
	@Test(groups = "smoke")
	public void M3()
	{
		System.out.println("i am meth m3");
	}
	
	

	
}
