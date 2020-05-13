#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n;
cin>>n;
char s[1000],bat[1000];
int num,max=0;
for(int i=0;i<n;i++)
{
    scanf("%[^,],%d ",s,&num);
    if(num>max)
    {
        max=num;
        strcpy(bat,s);
    }
}
cout<<bat;
}
