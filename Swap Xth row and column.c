#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,x;
scanf("%d",&n);
int arr[n+1][n+1];
for(int ind=1;ind<=n;ind++)
{
    for(int itr=1;itr<=n;itr++)
        scanf("%d",&arr[ind][itr]);
}
scanf("%d",&x);
for(int row=1;row<=n;row++)
{
    for(int col=1;col<=n;col++)
    {
        if(row==x||col==x)
            printf("%d ",arr[col][row]);
        else
            printf("%d ",arr[row][col]);
    }
    printf("\n");
}

}

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,x;
    scanf("%d",&n);
    int arr[n][n];
    for(int i=0;i<n;++i){
        for(int j=0;j<n;++j){
            scanf("%d",&arr[i][j]);
        }
    }scanf("%d",&x);
    for(int i=0;i<n;++i){
        int temp=arr[x-1][i];
        arr[x-1][i]=arr[i][x-1];
        arr[i][x-1]=temp;
    }for(int i=0;i<n;++i){
        for(int j=0;j<n;++j){
            printf("%d ",arr[i][j]);
        }printf("\n");
    }
}
