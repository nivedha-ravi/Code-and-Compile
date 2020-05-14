#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n,m;
cin>>n>>m;
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
int sum=0;
for(int i=0;i<m;i++)
{
    sum+=a[i];
}
cout<<sum;

}
