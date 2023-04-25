package test;

public class pattern1_0 {
	public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                if (j%2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                if (j < i) {
                    System.out.print(" ");
                }
            }
            for (int j = i; j > 0; j--) {
                if (j%2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
                if (j > 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
