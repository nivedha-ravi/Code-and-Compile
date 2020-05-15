#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n;
cin>>n;
int y=1,x=1,k=0,a=0;
for(int i=n;i>0;i--)
{
    int z=n,k=y;
    cout<<y<<" ";
    for(int j=1;j<i;j++)
    {
        if(j>0)
        {
            a+=n-j+k+1;
            cout<<a<<" ";
        }
        z-=1;
        k=0;
    }
    cout<<endl;
    y+=1;
    k=y;
    a=0;
}

}
