#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n,flag=0;
cin>>n;
char country[n][100],capital[n][100];
for(int i=0;i<n;i++)
{
    scanf("%s %s\n",country[i],capital[i]);
}
char a[100];
scanf("%s",a);
int i;
for(i=0;i<n;i++)
{
    if(strcmp(country[i],a)==0)
    {
        flag=1;
        break;
    }
}
if(flag==1)
{
    cout<<capital[i];
}
else
{
    cout<<"NONE";
}
}
