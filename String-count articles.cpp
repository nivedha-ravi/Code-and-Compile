#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
char s[100][1000];
int count=0,i=0;
while(scanf("%s ",s[i])>0)
{
    i++;
}
for(int j=0;j<i;j++)
{
    if(strcmp(s[j],"a")==0||strcmp(s[j],"an")==0||strcmp(s[j],"the")==0||strcmp(s[j],"an,")==0||strcmp(s[j],"a,")==0||strcmp(s[j],"the,")==0||strcmp(s[j],"the.")==0||strcmp(s[j],"a.")==0||strcmp(s[j],"an.")==0)
    {
        count++;
    }
}
cout<<count;

}
