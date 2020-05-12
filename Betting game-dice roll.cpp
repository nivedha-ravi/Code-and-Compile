#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int a[10],k=0,temp=0,x,y,t=0;
string s;
getline(cin,s);
cin>>x>>y;
for(int i=0;i<=s.length();i++)
{
    if(isdigit(s[i]))
    {
        temp=(temp*10)+(s[i]-'0');
    }
    else if(s[i]==' '||s[i]=='\0')
    {
        a[k++]=temp;
        temp=0;
    }
}
for(int i=0;i<k;i++)
{
    if(a[i]%2!=0)
    {
        t=t+x;
    }
    else
    {
        t=t-y;
    }
}
cout<<t;

}
