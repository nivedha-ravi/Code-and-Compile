Input:
malayalam
a
l
Output:
2
Input:
engine
e
n
Output:
1

Java Code:
import java.util.*;
class gfg
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String str=in.nextLine();
char c=in.next().charAt(0);
char c1=in.next().charAt(0);
char[] ch=str.toCharArray();
int count=0;
for(int i=0;i<ch.length-1;i++)
{
if(ch[i]==c && ch[i+1]==c1)
{
count++;
}
}
System.out.println(count);
}
}
