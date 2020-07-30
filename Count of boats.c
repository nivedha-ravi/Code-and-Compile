/*
Example Input/Output 1:
Input:
3 1 2
Output:
1
Explanation:
Here L = 3 and there are two people standing in the queue. The sum of weights of the two people is 3 (1+2) which is less than or equal to L. So both can travel in a single boat. Hence the output is 1 Example Input/Output 2: Input: 5 5 3 5 1 4 5 3 Output: 6 Explanation: Here L = 5 and there are seven people standing in the queue. The people having the weight 1 and 4 can travel in a single boat, as the sum of their weights is 5 (1+4) which is less than or equal to L. The rest can travel on a separate boat. So the minimum number of boats required is 6. Hence the output is 6
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int l,i,n=0,a[1000]={0},c,j;
scanf("%d",&l);
while(scanf("%d",&a[n])>0)
{
    n++;
}
c=n;
for(i=0;i<n-1;i++)
{
    for(j=0;j<n-i-1;j++)
    {
        if(a[j]>a[j+1])
        {
            int t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
    }
}
for(i=0;i<n;i++)
{
    for(j=n-1;j>=0;j--)
    {
        if(a[i]+a[j]<=l && i!=j && a[i]!=-1 && a[j]!=-1)
        {
            c--;
            a[i]=-1;
            a[j]=-1;
            break;
        }
    }
}
printf("%d",c);

}
