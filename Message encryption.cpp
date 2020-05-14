#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
string s;
cin>>s;
int len;
cin>>len;
int n=s.length()/len,i,j,k=0;
char st[n][len];
for(i=0;i<n;i++)
{
    if(i%2==0)
    {
        for(j=0;j<len;j++)
        {
            st[i][j]=s.at(k);
            k++;
        }
    }
    else
    {
        for(j=len-1;j>=0;j--)
        {
            st[i][j]=s.at(k);
            k++;
        }
    }
}
for(int i=0;i<len;i++)
{
    for(int j=0;j<n;j++)
    {
        cout<<st[j][i];
    }
}
}
