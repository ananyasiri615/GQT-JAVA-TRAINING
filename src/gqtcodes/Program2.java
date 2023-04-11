package gqtcodes;
class Calci{
	String name;
	int a=10, b= 20; //instance variable
	static int c=10, d=20; //static variables
	
	void add() {
		int e , f; //local variable
		//System.out.println(e); //local variable don't get default values
		a = 10;
		c = 30;
		a = 300;
		}
	void sub() {
		c = 100;
		//e = 20; //local variables cannot be accessed outside the method
	}
	
} 

public class Program2 {

	public static void main(String args[]) {
		System.out.println(Calci.c);
		//System.out.println(Calci.a); //local variables cannot be accessed without object of the class it is present in
		Calci c = new Calci();
		System.out.println(c.name);
		System.out.println(c.b);
		
	}

}
