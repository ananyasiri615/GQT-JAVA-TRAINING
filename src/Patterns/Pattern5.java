package Patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int count=25;
		for (int i = 1; i <= 5; i++) {
			System.out.print(count+" ");
			count=count-5;
		}

	}

}

//OUTPUT
//25 20 15 10 5 