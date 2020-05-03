#include<stdio.h>
#include <stdlib.h>
int num(int n){
    int c=0;
    while(n){
        int a=n%2;
        if(a==0){
            c++;
        }
        n=n/2;
    }
    return c;
}

int main()
{
int n;
scanf("%d",&n);
int arr[n];
for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
}
int temp;
int flag=1;
while(flag==1){
    flag=0;
    for(int i=0;i<n-1;i++){
        if(num(arr[i])>num(arr[i+1])){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            flag=1;
        }
    }

}
for(int i=0;i<n;i++){
    printf("%d ",arr[i]);
}

}
