Two integer arrays of length L1 and L2 are passed as input. The program must print the sum of the distinct elements present in both the arrays.
That is the program must print the count of integer values that are present in the first array but not in the second array plus the count of integer values that are present in the second array but not in the first array.

Input Format:
The first line will contain L1 and L2 separated by a space.
The second line will contain the L1 integer values separated by a space.
The third line will contain the L2 integer values separated by a space.

Output Format:
First line will contain the integer value which is the count of the distinct elements in both the arrays.

Boundary Conditions:
1 <= L1 <= 50
1 <= L2 <= 50

Example Input/Output 1:
Input:
4 5
1 5 9 10
22 5 12 9 5

Output:
4

Explanation:
The distinct elements present in first array are 1, 10 and in the second array are 22, 12.

Example Input/Output 2:
Input:
3 2
100 200 300
201 600

Output:
5

JAVA CODE:
import java.util.*;
class gfg
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int m=in.nextInt();
int n=in.nextInt();
int a[]=new int[m];
int b[]=new int[n];
for(int i=0;i<m;i++)
{
a[i]=in.nextInt();
}
for(int j=0;j<n;j++)
{
b[j]=in.nextInt();
}
int k=0,count=0;
for(int i=0;i<m;i++)
{
for(int j=i+1;j<m;j++)
{
if(a[i]==a[j])
{
a[j]='\0';
k++;
}
}
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(b[i]==b[j])
{
b[j]='\0';
k++;
}
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
if(a[i]==b[j])
{
count++;
}
}
}
System.out.print(m+n-(count*2)-k);
}
}
