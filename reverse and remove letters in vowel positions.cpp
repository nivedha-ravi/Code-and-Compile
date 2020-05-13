#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
string s;
cin>>s;
int a[50],k=0;
for(int i=0;i<s.length();i++)
{
    if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
    {
        a[k++]=i;
    }
}
for(int i=0,j=s.length()-1;i<j;i++,j--)
{
    char temp=s[i];
    s[i]=s[j];
    s[j]=temp;
}
for(int i=0;i<s.length();i++)
{   int flag=0;
    for(int j=0;j<k;j++)
    {
        if(a[j]==i)
        {
            flag=1;
            break;
        }
    }
    if(flag==0){
        cout<<s[i];
    }
}

}
