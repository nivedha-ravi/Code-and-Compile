#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int a[100],k=0,maxcount=0,res;
while(scanf("%d ",&a[k])>0)
{
    k++;
}
for(int i=0;i<k;i++)
{
    int count=0;
    for(int j=i+1;j<k;j++)
    {
        if(a[i]==a[j])
        {
            count++;
        }
    }
    if(count>maxcount)
    {
        maxcount=count;
        res=a[i];
    }
    else if(maxcount==0)
    {
        res=a[0];
    }
}
cout<<res;

}
