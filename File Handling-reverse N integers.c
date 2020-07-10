#include<stdio.h>
#include <stdlib.h>

int main()
{
char filename[101];
scanf("%s",filename);
FILE *fp=fopen(filename,"r");
int N;
fscanf(fp,"%d",&N);
int arr[N];
for(int i=0;i<N;i++)
{
    fscanf(fp,"%d",&arr[i]);
}
for(int i=N-1;i>=0;i--)
{
    printf("%d ",arr[i]);
}


}
