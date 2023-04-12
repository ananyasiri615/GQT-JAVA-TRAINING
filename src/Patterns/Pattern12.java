package Patterns;
import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		int count = 1;
		for(int i=1;i<=n;i++) {
			count=i;
			for(int j=1;j<=n;j++) {
				System.out.print(count+"	");
				count = count+n;
			}
			System.out.println();
		}

	}

}

/*
 * OUTPUT
 * 1 	6	11	16	21
 * 2	7	12	17	22
 * 3	8	13	18	23
 * 4	9	14	19	24
 * 5	10	15	20	25	
 */