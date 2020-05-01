/*Smaller Matrix Search [ZOHO]
A bigger NxN matrix is passed as the input. Also a smaller MxM matrix is passed as input.
 The program must print TRUE if the smaller matrix can be found in the bigger matrix.
 Else the program must print FALSE.
Input Format:
First line will contain the value of N.
Second line will contain the value of M.
Next N lines will contain the values in the N*N matrix with each value separated by one or more space.
Next M lines will contain the values in the M*M matrix with each value separated by one or more space.
Output Format:
First line will contain the string value TRUE or FALSE
Boundary Conditions:
3 <= N <= 202 <= M <= N
Example Input/Output 1:
Input:
3
2
4 5 9
1 3 5
8 2 4
3 5
2 4
Output:
TRUE
Example Input/Output 2:
Input:
3
2
4 5 9
1 3 5
8 2 4
4 5
1 4
Output:
FALSE
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int a[100][100],b[100][100];
    int i,j,r,c,m=0,o=0,k,l,x,y;
    scanf("%d%d",&r,&c);
    for(i=0;i<r;i++){
        for(j=0;j<r;j++){
            scanf("%d",&a[i][j]);
        }
    }
    for(i=0;i<c;i++){
        for(j=0;j<c;j++){
            scanf("%d",&b[i][j]);
        }
    }
    for(i=0;i<r;i++){
        for(j=0;j<r;j++){
            if(a[i][j]==b[0][0]){
                for(x=i,k=0;x<i+c,k<c;x++,k++){
                    for(y=j,l=0;y<j+c,l<c;y++,l++){
                        if(a[x][y]==b[k][l]){
                            m++;
                        }
                    }
                }
            }
            if(m==c*c){
                o=1;
            }
            m=0;
        }
    }
    printf(o==1?"True":"False");

}
