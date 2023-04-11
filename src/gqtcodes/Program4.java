package gqtcodes;

public class Program4 {
		public static void main(String[] args) {
			byte a = 100; //accepted
			byte b = -100; //accepted
			byte c = 127; //accepted
			byte d = -128; //accepted
			byte e = -130; // type mismatch... lossy conversion of int
			byte f = c3; //long cannot be stored in byte
			byte g = c2; //int cannot be stored inside byte
			byte h = c1 //short cannot be stored inside byte
			
			//in java int is the default data type
					
			short a1 = 25467; //accepted
			short b1 = -25467; //accepted
			short c1 = 32767; //accepted
			short d1 = -32767; //accepted
			short e1 = -32770; // type mismatch... lossy conversion of int
			short f1 = d; //byte can be stored in short
			short g1 = c3; //long cannot be stored inside short
			short h1 = c2 //int cannot be stored inside short
			
			int a2 = 456789; //accepted
			int b2 = -456789; //accepted
			int c2 = 2147483647; //accepted
			int d2 = -2147483648; //accepted
			int e2 = -21474836479; // type mismatch... lossy conversion of int
			int f2 = d; //byt1e can be stored in int
			int g2 = c1; //short can be stored inside int
			int h2 = c3 //long cannot be stored inside int
					
			
			long a3 = 12345678999l; //accepted
			long b3 = -12345678999l; //accepted
			long c3 = 23456789234567l; //accepted
			long d3 = -23456789234567l; //accepted
			long e3 = -123456789012345678909l; // type mismatch... lossy conversion of int
			long f3 = d; //byt1e can be stored in long
			long g3 = c1; //short can be stored inside long
			long h3 = c2 //int cannot be stored inside long
			

	}

}
