package MethodsInJava;

public class autoPromotion {
	public void M1(int x)
	{System.out.println(x);
		
	}
	public void add(float f)
	{System.out.println("Float Value displayed");
	
	}
	public static void main(String[] args) {
		
		autoPromotion obj=new autoPromotion();
		obj.M1(10);
		obj.M1(20);
	 obj.add(10.10f);	//(10.10) error-value is double & class is float 
		
	}

}