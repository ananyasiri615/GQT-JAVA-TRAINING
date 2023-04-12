package Patterns;
import java.util.Scanner;

public class Pattern15{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) { //*
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

/*
 * 		* * * * *
 * 		* * * *
 * 		
 * 
 * Case-1:
 * 	n=5
 * 	i=1
 * 		j=n --> j=5
 * 		j>=i --> 5>=1 (condition true)
 * 		j-- --> j=4
 * 
 * 		j>=i ---> 4>=1 (condition true)
 * 		j-- --> j=3
 * 
 * 		j>=i ---> 3>=1 (condition true)
 * 		j-- --> j=2
 * 
 * 		j>=i ---> 2>=1 (condition true)
 * 		j-- --> j=1
 * 
 * 		j>=i ---> 1>=1 (condition true)
 * 		j-- --> j=0
 * 		
 * 		j>=i ---> 0>=1 (condition false)
 * 
 * i=2 '
 * 		j=n --> j=5
 * 		j>=i --> 5>=2 (condition true)
 * 		j-- --> j=4
 * 
 * 		j>=i ---> 4>=2 (condition true)
 * 		j-- --> j=3
 * 
 * 		j>=i ---> 3>=2 (condition true)
 * 		j-- --> j=2
 * 
 * 		j>=i ---> 2>=2 (condition true)
 * 		j-- --> j=1
 * 
 * 		j>=i ---> 1>=2 (condition false)
 */