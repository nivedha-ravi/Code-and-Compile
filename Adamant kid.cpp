#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
char s[100];
int x,y;
scanf("%s\n",s);
int n=strlen(s);
cin>>x>>y;
x=x-1,y=y-1;
if(x>=n)
{
    x=x%n;
}
if(y>=n)
{
    y=y%n;
}
if(s[x]==s[y])
{
    cout<<"YES";
}
else
{
    cout<<"NO";
}

}
