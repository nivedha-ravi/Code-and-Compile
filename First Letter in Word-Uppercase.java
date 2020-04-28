Input:
She is  happy
Output:
She Is  Happy
Input:
joIN tHE ParTY
Output:
JoIN THE ParTY

 JAVA CODE:
 import java.util.*;
 class gfg
 {
 public static void main(String args[])
 {
 Scanner in=new Scanner(System.in);
 String str=in.nextLine();
 String[] s=str.split(" ");
 char[] ch=new char[str.length];
 for(int i=0;i<s.length;i++)
 {
 ch=s[i].toCharArray();
 for(int j=0;j<ch.length;j++)
 {
 if(j==0 &&(Character.isLowerCase(ch[j]))
 {
 System.out.print(Character.toUpperCase(ch[j]));
 }
 else
 {
 System.out.print(ch[j]);
 }
 }
 System.out.print(" ");
 }
 }
 }
