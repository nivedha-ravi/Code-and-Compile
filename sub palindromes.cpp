/*
INPUT:
everest
OUTPUT:
2
*/
#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
string s;
cin>>s;
int res=0;
for(int i=0;i<s.length();i++)
{
    for(int j=i+1;j<s.length();j++)
    {
        if(s[i]==s[j])
        {
            int c=0;
            for(int k=i,l=j;k<=j,l>=i;k++,l--)
            {
                if(s[k]==s[l])
                {
                    c++;
                }
            }
            if(c==(j-i)+1)
            {
                res++;
            }
        }
    }
}
cout<<res;
}
