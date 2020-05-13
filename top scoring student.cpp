#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n;
cin>>n;
char s[1000],top[1000];
int maths,phy,chem,maxmarks=0;
for(int i=0;i<n;i++)
{
    scanf("%[^:]:%d:%d:%d\n",s,&maths,&phy,&chem);
    int sum=maths+phy+chem;
    if(sum>maxmarks)
    {
        maxmarks=sum;
        strcpy(top,s);
    }

}
cout<<top;

}
