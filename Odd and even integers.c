/*
INPUT:
5
OUTPUT:
1 2 3 4 5
INPUT:
4
1 3 5 7
OUTPUT:
1 3 3 5 7
*/
#include <stdio.h>

int main() {
	int n;
	scanf("%d\n",&n);
	int a[n];
	for(int i=0;i<n;i++)
	{
	    scanf("%d ",&a[i]);
	}
	for(int i=0;i<n-1;i++)
	{
	    if(a[i]%2!=0 && a[i+1]%2==0)
	    {
	        printf("%d ",a[i]*a[i+1]);
	    }
	    else if(a[i]%2==0 && a[i+1]%2!=0)
	    {
	        printf("%d ",a[i]+a[i+1]);
	    }
	    else if(a[i]%2!=0 && a[i+1]%2!=0 || a[i]%2==0 && a[i+1]%2==0)
	    {
	        printf("%d %d ",a[i],a[i+1]);
	    }

	}
	return 0;
}
