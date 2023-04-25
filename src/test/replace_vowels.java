package test;

import java.util.Scanner;

public class replace_vowels
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the string");
        String stv = scan.nextLine();
        char ch[]= stv.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
               if (ch[i]=='a' || ch[i]=='A' )
               {
                ch[i]='@';
               }
               else if(ch[i]=='e' || ch[i]=='E')
               {
            	   ch[i]='#';
               }
               else if(ch[i]=='i' || ch[i]=='I')
               {
            	   ch[i]='$';
               }
               else if(ch[i]=='o' || ch[i]=='O')
               {
            	   ch[i]='%';
               }
               else if(ch[i]=='u' || ch[i]=='U')
               {
            	   ch[i]='&';
               }
               
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}