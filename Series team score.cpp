#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
string s,s1;
getline(cin,s);
getline(cin,s1);
int a[100],b[100],temp=0,k=0,l=0;
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
for(int i=0;i<=s1.length();i++)
{
    if(isdigit(s1[i]))
    {
        temp=(temp*10)+(s1[i]-'0');
    }
    else if(s1[i]==' '||s1[i]=='\0')
    {
        b[l++]=temp;
        temp=0;
    }
}
int A=0,B=0;
for(int i=0,j=0;i<k&& j<l;i++,j++)
{
    if(a[i]==b[j])
    {
        A+=1;
        B+=1;
    }
    else if(a[i]>b[j])
    {
        A+=3;
    }
    else if(b[j]>a[i])
    {
        B+=3;
    }
}
cout<<A<<" "<<B;
}
