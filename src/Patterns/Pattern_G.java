package Patterns;

import java.util.Scanner;

public class Pattern_G {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i!=0 && i!=(n-1)) ||
				   (i==0 && j!=0 && j<=n/2) ||
				   (i==n/2 && j>n/4 && j<n/2) ||
				   (i==(n-1) && j>0 && j<=n/4)||
				   (j==(n/4) && i>n/2) ||
				   (j==(n/2) && i>n/2)) {
					System.out.print("# ");
				
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
