/*
Example Input/Output 1:
Input:
6
52 75 0 50 2 1
Output:
3-49,51,53-74
Explanation:
Here N = 6 and the 6 integers are 52, 75, 0, 50, 2 and 1.
After sorting the 6 integers in ascending order, the integers become 0, 1, 2, 50, 52 and 75.
The missing integers between 2 and 50 are 3 to 49. So the missing range is 3-49.
The missing integer between 50 and 52 is 51.
The missing integers between 52 and 75 are 53 to 75.
So the missing range is 53-74.
Hence the output is 3-49,51,53-74
Example Input/Output 2:
Input:
7
10 60 46 8 58 0 55
Output:
1-7,9,11-45,47-54,56-57,59
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
  int i,j,t,n,s[1001],c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&s[i]);
  for(i=0;i<n;i++)
    for(j=i+1;j<n;j++)
      if(s[i]>s[j])
      {
        t=s[i];s[i]=s[j];s[j]=t;
      }
      if(s[0]!=0){
        if(s[0]==1)
          printf("0");
        else
          printf("0-%d",s[0]-1);
        c=1;
      }
      for(i=0;i<n-1;i++){
        if(s[i]+1!=s[i+1])
        {
          if(c==0)
            c=1;
          else
            printf(",");
          if(s[i]+1==s[i+1]-1)
            printf("%d",s[i]+1);
          else
            printf("%d-%d",s[i]+1,s[i+1]-1);
        }
    }
}
