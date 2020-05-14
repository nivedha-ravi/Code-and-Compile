#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int m,n;
cin>>m>>n;
int a[m],b[n],k=0,count=0;
for(int i=0;i<m;i++)
{
    cin>>a[i];
}
for(int i=0;i<n;i++)
{
    cin>>b[i];
}
for(int i=0;i<m;i++)
{
    for(int j=i+1;j<m;j++)
    {
        if(a[i]==a[j])
        {
            a[j]='\0';
            k++;
        }
    }
}
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(b[i]==b[j])
        {
            b[j]='\0';
            k++;
        }
    }
}
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        if(a[i]==b[j])
        {
            count++;
        }
    }
}
cout<<m+n-(count*2)-k;
}
