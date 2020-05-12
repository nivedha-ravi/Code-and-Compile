#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n;
cin>>n;
int a[n];
for(int i=0;i<n;i++)
{
    cin>>a[i];
}
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(a[i]>a[j])
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
int r=0;
for(int k=2;k<=a[0];k++)
{
    int c=0;
    for(int j=0;j<n;j++)
    {
        if(a[j]%k==0)
        {
            c++;
        }
    }
    if(c==n)
    {
        r++;
    }
}
cout<<r;


}
