package variables;

public class SwitchBreak1
{ public static void main(String[] args) 
{
	int n=20;
	switch(n)
	{
	case 10:
		System.out.println("i am 10");
		break;
		
	case 20:
		System.out.println("i am 20");
		break;
		
	case 30:
		System.out.println("i am 30");
		
		default:
			System.out.println("no one is matching");
			
	}
	System.out.println("This method belongs to main Method");
	
	
} 

}
