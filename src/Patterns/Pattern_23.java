package Patterns;

import java.util.Scanner;

public class Pattern_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");

		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || i==j || i==n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}


/*
 * 	# 
 *  # #
 *  # - #
 *  # - - #
 *  # # # # #
 */