#include <stdio.h>

int main() {
	int a[10],i=0,x,y,t=0;
	while(scanf("%d ",&a[i])>0)
	{
	    i++;
	}
	x=a[i-2];
	y=a[i-1];
	i=i-2;
	for(int j=0;j<i;j++)
	{
	    if(a[i]%2!=0)
	    {
	        t=t+x;
	    }
	    else
	    {
	        t=t+y;
	    }
	}
	printf("%d",t);
}
