package MethodsInJava;

public class instantVar {
	int x=50; //instant var
	public void Go1()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		instantVar obj=new instantVar();
		//obj.Go1(); obj ref method do not use it
		
		System.out.println(obj.x); //to cl inst var, without this it 
									//not execute
	}

}
