#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n;
cin>>n;
int first=(n*(n+1))/2;
for(int i=0;i<n;i++)
{
    int val=n;
    int temp=first;
    cout<<temp<<" ";
    for(int j=0;j<n-i-1;j++)
    {
        cout<<temp-val<<" ";
        temp=temp-val;
        val-=1;
    }
    first-=1;
    cout<<endl;
}

}
