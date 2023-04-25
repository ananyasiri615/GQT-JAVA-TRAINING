package Patterns;

import java.util.Scanner;

public class Pattern_Even{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) //n==10 --> 2 4 6 8 10
		{
			if(i%2==0) {
				System.out.print("#");
			}
			else {
				System.out.print(" ");
			}
		}

	}
}