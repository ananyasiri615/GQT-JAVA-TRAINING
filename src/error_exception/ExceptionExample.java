package error_exception;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1");
		int num1 = sc.nextInt();
		System.out.println("Enter num 2");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println("res");
	}

}
