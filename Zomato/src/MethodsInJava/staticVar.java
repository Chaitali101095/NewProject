package MethodsInJava;

public class staticVar {
	static int y=20;	//static var

public static void main(String[] args) {
	
	//System.out.println(y); //1st approach ans=20
	
	//staticVar obj=new staticVar(); 
	// System.err.println(y); //2nd approch using OBJ ref
	 
	 System.out.println(staticVar.y); //3rd approch using CLASS REF
	 
	
	

	}

}
