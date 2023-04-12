package Patterns;
import java.util.Scanner;


public class Pattern6 {
	public static void main(String[] args) {
//		Scanner is a built-in class in java
//		Any class if it has to be used the we have to create the object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();//which ever is the next integer value collect it & add into n
		int count=n*n;
		for (int i = 1; i <= n; i++) {			
			System.out.print(count+" ");
			count=count-n;
		}
	}
}

//OUTPUT
//Enter the value of n: 
//5
//25 20 15 10 5 