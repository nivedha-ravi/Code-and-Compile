/*
Example Input/Output 1:
Input:
3
1/2 3/2 4/5
5/3 4/9 8/2
2/3 8/9 1/6
Output:
5/2 1/5 3/2
2/2 4/9 4/6
8/3 1/3 8/9
Explanation:
In the 3x3 matrix, the fractions in the border are highlighted below.
1/2 3/2 4/5
5/3 4/9 8/2
2/3 8/9 1/6
After rotating the numerators in the border by 1 position in the clockwise direction, the matrix becomes
5/2 1/2 3/5
2/3 4/9 4/2
8/3 1/9 8/6
After rotating the denominators in the border by 1 position in the anti-clockwise direction, the matrix becomes
5/2 1/5 3/2
2/2 4/9 4/6
8/3 1/3 8/9
Hence the output is
5/2 1/5 3/2
2/2 4/9 4/6
8/3 1/3 8/9
Example Input/Output 2:
Input:
4
48/83 84/39 10/46 38/55
89/85 21/52 11/70 51/19
31/13 78/14 75/14 27/73
63/46 70/80 45/25 19/24
Output:
89/39 48/46 84/55 10/19
31/83 21/52 11/70 38/73
63/85 78/14 75/14 51/24
70/13 45/46 19/80 27/25
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);

    int num[n][n];
    int den[n][n];

    for(int i=0;i<n;++i){
        for(int j=0;j<n;++j){
            scanf("%d/%d",&num[i][j],&den[i][j]);
        }
    }

    for(int i=0;i<n;++i){
        for(int j=0;j<n;++j){
            if(i==0 && j==0){
                printf("%d/%d ",num[i+1][j],den[i][j+1]);
            }
            else if(i==0 && j==n-1){
                printf("%d/%d ",num[i][j-1],den[i+1][j]);
            }
            else if(i==n-1 && j==0){
                printf("%d/%d ",num[i][j+1],den[i-1][j]);
            }
            else if(i==n-1 && j==n-1){
                printf("%d/%d ",num[i-1][j],den[i][j-1]);
            }
            else if(i==0){
                printf("%d/%d ",num[i][j-1],den[i][j+1]);
            }
            else if(j==0){
                printf("%d/%d ",num[i+1][j],den[i-1][j]);
            }
            else if(i==n-1){
                printf("%d/%d ",num[i][j+1],den[i][j-1]);
            }
            else if(j==n-1){
                printf("%d/%d ",num[i-1][j],den[i+1][j]);
            }
            else{
                printf("%d/%d ",num[i][j],den[i][j]);
            }
        }
        printf("\n");
    }
}
