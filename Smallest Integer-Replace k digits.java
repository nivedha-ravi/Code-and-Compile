//*The program must accept two Integers N And K as the input.The program must print the smallest possible integer by replacing exactly K digits in N with 0.
INPUT:
2001356 2
OUTPUT:
356
Explanation:
After replacing the two digits 2 and 1 with 0 in 2001356,the integer becomes 356(0000356=356).
Hence the output is 356.
//*
import java.util.*;
public class Hello
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s=in.nextLine();
String[] st=s.split(" ");
String str=st[0];
int k=Integer.parseInt(st[1]);
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]<='9' && ch[i]>'0' && k!=0)
{
ch[i]='0';
k--;
}
}
String a=String.valueOf(ch);
int small=Integer.parseInt(a);
System.out.print(small);
}
}
