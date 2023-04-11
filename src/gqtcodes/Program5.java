package gqtcodes;

public class Program5 {

		public static void main(String[] args) {
			byte a = 100; //accepted
			byte b = -100; //accepted
			byte c = 127; //accepted
			byte d = -128; //accepted
			
			short a1 = 25467; //accepted
			short b1 = -25467; //accepted
			short c1 = 132; //accepted
			short d1 = -32768; //accepted
			short f1 = d; //implicit type casting
			
			int a2 = 456789; //accepted
			int b2 = -456789; //accepted
			int c2 = 2147483647; //accepted
			int d2 = -2147483648; //accepted
			int f2 = d; //implicit type casting
			int g2 = c1; //implicit type casting
			
			long a3 = 12345678999l; //accepted
			long b3 = -12345678999l; //accepted
			long c3 = 2345678923456l; //accepted
			long d3 = -2345678923456l; //accepted
			long f3 = d; //implicit type casting
			long g3 = c1; //implicit type casting
			long h3 = d2; //implicit type casting
			
			//type casting :It is the process of converting one type of data into another type 
			//implicit type casting :
			//It is the process of converting one type of data into another type automatically by 
			//the compiler
			//explicit type casting
			//It is the process of converting one type of data into another type manually by 
			//the programmer
			byte f = (byte) c3;//long cannot be stored in byte --- explicit type casting 
			byte g = (byte) c2;//int cannot be stored inside byte 
			byte h = (byte)c1;//short cannot be stored inside byte
			short g1 = (short) c3;//long cannot be stored inside short 
			short h1 = (short)c2; //int cannot be stored inside short
			int h2 = (int)c3;//long cannot be stored inside int
			System.out.println(f);
			System.out.println(g);
			System.out.println(h);
			System.out.println(g1);
			System.out.println(h1);
			System.out.println(h2);
	}
}
