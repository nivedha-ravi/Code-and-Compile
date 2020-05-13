#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
char s[20][100];
int i=0;
while(scanf("%s ",&s[i])>0)
{
    i++;
}
for(int j=i-1;j>=0;j--)
{
    cout<<s[j]<<" ";
}
}
