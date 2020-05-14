#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int x,y,z,s=0;
cin>>x>>y>>z;
if((z>x&&z>y)||(z%2!=0&&x%2==0&&y%2==0)||(abs(x-y)<z))
{
    cout<<"-1";
}
else
{
    while(abs(x-y)>=z)
    {
        s+=1;
        x=abs(x-y);
        if(x==z)
        {
            break;
        }
    }

cout<<s*2;
}


}
