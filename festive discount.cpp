#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n;
cin>>n;
int a[n],sum=0,c,d;
for(int i=0;i<n;i++)
{
    cin>>a[i];
    if(a[i]>400 && a[i]<=500)
    {
        d=a[i]*20/100;
        c=a[i]-d;
        sum=sum+c;
    }
    else if(a[i]>500 && a[i]<1000)
    {
        d=a[i]*25/100;
        c=a[i]-d;
        sum=sum+c;
    }
    else if(a[i]>=1000)
    {
        d=a[i]*50/100;
        c=a[i]-d;
        sum=sum+c;
    }
    else
    {
        sum=sum+a[i];
    }
}
if(sum>2000)
{
    printf("%.2f",(float)(sum-100.0));
}
else
{
    printf("%.2f",float(sum));
}


}
