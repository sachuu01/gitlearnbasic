package MavenProj.MavenDemo;

public class Calculation {
	static int a;
	static int b;
	static int c;
	
	
	public static void calculator()
	{
		a=10;
		b=2;
		c= a*b;
		System.out.println("Multipication of Two No : " +c);
		
	}

	public static void main(String[] args) {
		
		Calculation cal= new Calculation();
		
		calculator();

	}

}
