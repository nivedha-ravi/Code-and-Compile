#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int sumx=0,sumy=0;
int num;
char ch,ch1;
while(scanf("%c%d",&ch,&num)>0)
{
    if(ch=='x'||ch=='E')
    {
        sumx=sumx+num;
    }
    else if(ch=='W')
    {
        sumx=sumx-num;
    }
    else if(ch=='N'||ch=='y')
    {
        sumy=sumy+num;
    }
    else if(ch=='S')
    {
        sumy=sumy-num;
    }
}
cout<<"x"<<sumx<<" "<<"y"<<sumy;



}
