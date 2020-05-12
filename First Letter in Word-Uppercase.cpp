#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
string s;
getline(cin,s);
for(int i=0;i<s.length();i++)
{
    if(i==0)
    {
        cout<<(char)toupper(s[i]);
    }
    else if(s[i]==' ' && isalpha(s[i+1]))
    {
       cout<<" "<<(char)toupper(s[i+1]);
       i++;
    }
    else
    {
        cout<<s[i];
    }
}

}
