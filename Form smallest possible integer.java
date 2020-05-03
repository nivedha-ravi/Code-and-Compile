/*
The program must accept a string S containing only digits as the input.
The program must form the smallest possible integer X using the digits in S.
Finally,the program must print the value of X as the output.
INPUT:
541305415601160561561060606606067888799932266544445524554841887021
OUTPUT:
1000000000111111122223344444444445555555555666666666666777888888999
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++)
		{
		    if(ch[i]=='1')
		    {
            System.out.print(ch[i]);
            ch[i]='\0';
		        break;
		    }
		}
		for(int i=0;i<ch.length();i++)
		{
		    if(ch[i]!='\0')
		    {
		        System.out.print(ch[i]);
		    }
		}

	}
}
