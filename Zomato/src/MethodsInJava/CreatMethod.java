package MethodsInJava;

public class CreatMethod 
{ 
	public void add()	//this is a method
	{
		System.out.println("i am an method");
		
	}
	
	public static void main(String[] args) 	//main method
	{
		CreatMethod k=new CreatMethod();//creat object-
											//ClassN objN=new ClassN();
		
		      k.add(); 	//call the method by using objname.meth name();
		      k.add();

	}

}
