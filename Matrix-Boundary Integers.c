*/
Example Input/Output 1:
Input:
3 4 12
12 12 12 12
12 12 88 92
12 12 12 12
Output:
YES
Explanation:
Here K=12, In the given 3x4 matrix, the boundary integers are highlighted below.
12 12 12 12
12 88 92 12
12 12 12 12
Here all the integers in the boundary are equal to 12, so YES is printed as the output.
Example Input/Output 2:
Input:
5 5 10
10 10 10 10 10
10 73 38 11 20
10 19 78 79 10
10 33 49 59 30
10 99 10 75 10
Output:
NO
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int r,c,k;
scanf("%d %d %d",&r,&c,&k);
int a[r][c];
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        scanf("%d ",&a[i][j]);
        if(i==0 || j==0 ||i==r-1||j==c-1)
        {
            if(a[i][j]!=k)
            {
                printf("NO");
                return 0;
            }
        }
    }
}
printf("YES");
return 0;
}
