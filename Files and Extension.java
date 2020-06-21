/*
 Input:
 6
 Hello.java
 srack.c
 tcinput.txt
 tcoutput.txt
 tcgenerator.py
 Student.java
 Output:
 2 .java
 1 .c
 2 .txt
 1 .py
 Explanation:
 There are two files with the extension ".java". So 2 .java is printed.
 There is only one file with the extension ".c". So 1 .c is printed.
 There are two files with the extension ".txt". So 2 .txt is printed.
 There is only one file with the extension ".py". So 1 .py is printed.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
		    String s=in.next();
		    str[i]=s.substring(s.lastIndexOf('.'),s.length());
		}
		for(int i=0;i<n;i++)
		{   int count=1;
		    for(int j=i+1;j<n;j++)
		    {
		        if(str[i].equals(str[j]))
		        {
		            count++;
		            str[j]="";
		        }
		    }
		    if(str[i]!="")
		    {
		    System.out.println(count+" "+str[i]);
		    }
		}

	}
}
