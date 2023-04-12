package Patterns;
import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	}

}

/*
 * OUTPUT
 * $ $ $ $ $
 * $ $ $ $ $
 * $ $ $ $ $
 * $ $ $ $ $
 * $ $ $ $ $
 * 
 * Computing table:
 * row(i)	column-stars(j)
 *   1			5
 *   2			5
 *   3			5
 *   4			5
 *   5			5
 *   
 * Since there is 2 entities (row & column) we must use 2 loops.
 * 
 * The solution to this can be provided by making use of nested loops.
 */