/*
INPUT:
abcdEFGHIJK
LMNOpqrstuvwwxxxYYYzzz
OUTPUT:
yes
*/
import java.util.*;

public class Hello
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s1=in.nextLine();
String s2=in.nextLine();
String str=s1+s2;
str=str.toLowerCase();
char ch[]=str.toCharArray();
Arrays.sort(ch);
char c1='a';
int count=0;
for(int i=0;i<ch.length;i++)
{
if(ch[i]==c1)
{
c1++;
count++;
}
}
if(count==26)
{
System.out.print("yes");
}
else
{
System.out.print("no");
}
}
}
