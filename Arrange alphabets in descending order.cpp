#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
string s;
cin>>s;
int num[26]={0};
for(int i=0;i<s.length();i++)
{
    num[s[i]-97]=1;
}
for(int i=25;i>=0;i--)
{
    if(num[i]==1)
    {
        cout<<(char)(i+97);
    }
}
}
