package MavenProj.MavenDemo;

public class Calculation {
	  int a;
	  int b;
	  int c;
	
	
	public  void calculator()
	{
		a=10;
		b=2;
		c= a*b;
		System.out.println("Multipication of Two No : " +c);
		
	}

	public static void main(String[] args) {
		
		Calculation cal= new Calculation();
		
		cal.calculator();

	}

}
