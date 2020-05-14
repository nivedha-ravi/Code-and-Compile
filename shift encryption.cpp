#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
string s;
getline(cin,s);
int x,y;
cin>>x>>y;
for(int i=0;i<s.length();i++)
{
    if(islower(s[i]))
    {
        char ree=s[i]+x;
        if(ree>122)
        {
            int h=ree-122;
            int res=h+96;
            cout<<(char)res;
        }
        else
        {
            cout<<(char)ree;
        }
    }
    else if(isdigit(s[i]))
    {
        cout<<(s[i]-'0')+y;
    }
    else
    {
        cout<<s[i];
    }
}


}
