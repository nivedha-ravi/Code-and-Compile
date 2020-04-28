"""
INPUT:
4
Sasikumar:50:60:70
Arun:60:40:90
Manoj:50:50:60
Rekha:60:35:45
OUTPUT:
Arun
"""
import java.io.*;
public class Hello
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int sum,m1,m2,m3,avg,maxavg=0,ctr=0;
String stud;
String top;
while(ctr<n)
{
stud=in.next();
m1=in.nextInt();
m2=in.nextInt();
m3=in.nextInt();
sum=m1+m2+m3;
avg=sum/3;
if(ctr==0)
{
maxavg=avg;
top=stud;
}
else
{
if(maxavg<avg)
{
maxavg=avg;
top=stud;
}
}
ctr++;
}
System.out.print(top);
}
}
