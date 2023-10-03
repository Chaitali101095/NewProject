package MethodsInJava;

public class methArgument {
	public void M1(int x) 	//Method with Argument
	{System.out.println(x);
	}
	public void add(int y,int z)
	{ System.out.println(y+z);
	
	}
	public void add(String c)
	{System.out.println(c);
	
	}
	public void add(float d)
	{System.out.println("Float argument is correct");
	
	}
	public void malbar(double e)
	{System.out.println("Double type argument also correct");
	
	}
	public static void main(String[] args) {
		methArgument obj=new methArgument();	//cteat Object
		
		obj.M1(5);		//while calling must provid input
		obj.add(10,15);
		obj.add("chaitu");
		obj.malbar('e');
		obj.add(10.10f);
		// TODO Auto-generated method stub

	}

}
