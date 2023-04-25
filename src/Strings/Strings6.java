package Strings;

public class Strings6 {
	public static void main(String[] args) {
		String s1="Mahabharatha";
		System.out.println(s1.toUpperCase());//MAHABHARATHA
		System.out.println(s1.toLowerCase());//mahabharatha
		System.out.println(s1.charAt(5));
		//System.out.println(s1.charAt(50));//ArrayIndexOutOfBoundException
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.indexOf('z'));
		System.out.println(s1.startsWith("Maha"));//true
		System.out.println(s1.startsWith("Vaha"));//false
		System.out.println(s1.endsWith("ratha"));//true
		System.out.println(s1.endsWith("Vaha"));//false
		System.out.println(s1.contains("bharat"));//true
		System.out.println(s1.contains("Vharat"));//false
		System.out.println(s1.getClass());
		System.out.println(s1.isBlank());
		System.out.println(s1.length());
		System.out.println(s1.lastIndexOf('a'));


	}
}
