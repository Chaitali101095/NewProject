package variables;

class IfElse {
	public static void main(String[]args)
	{
		int mark =90;
		if (mark>65)
		{
			System.out.println("Distinction");
		}
		else if(mark>=55 && mark <65)
		{
			System.out.println("First class");
		}
		else if(mark>=45 && mark<65)
		{
			System.out.println("Second class");
		}
		else if(mark>=35 && mark<45)
		{
			System.out.println("Pass class");
		}
		else
		{System.out.println("Failed");
		
		} }
	}
