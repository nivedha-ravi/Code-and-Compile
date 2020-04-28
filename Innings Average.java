"""The runs scored by a cricket team in the first and second innings of N test cricket matches are passed as input.
 The program must print the average of first and second innings (with precision upto two decimal places).
  Input Format: The first line denotes the value of N. Next N lines will contain the first and second innings score separated by a space.
   Output Format: The first line contains the average of first innings score.
   The second line contains the average of second innings score.
    Boundary Conditions: 2 <= N <= 20 The value of the runs will be from 0 to 1000.
 Example Input/Output 1:
  Input: 3 250 200 450 300 200 250
   Output: 300.00 250.00
   """

import java.util.*;
public class Hello
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
List<Integer> a=new ArrayList<>();
List<Integer> b=new ArrayList<>();
int first,second,ctr=0,sum=0,sum1=0;
while(ctr<n)
{
first=in.nextInt();
second=in.nextInt();
a.add(first);
b.add(second);
ctr++;
}
for(int k:a)
{
sum+=k;
}
System.out.printf("%.2f",(float)(sum/n));
System.out.println();
for(int j:b)
{
sum1+=j;
}
System.out.printf("%.2f",(float)(sum1/n));
}
}
