package MavenProj.MavenDemo;

public class Testone {
	
	int a;
	int b;
	int c;
	
	
	public void displayAddition()
	{
		 a= 10;
		 b= 20;
		 c= a+b;
	     
	     System.out.println("Addtion of a and b = " +c);
	
	}

	public  void calculation()
	{
		System.out.println("Addition of A ANd B : " + c);
	}
	
	
	
	public static void main (String args[])
	{
		Testone testone= new Testone();
		
		testone.calculation();
		 testone.displayAddition();
		
		
		
		
		
		
	}
	
	
}
