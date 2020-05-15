#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int m,n;
cin>>m>>n;
int a[m][n];
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        cin>>a[i][j];
    }
}
for(int i=0;i<n;i++)
{
    for(int j=m-1;j>=0;j--)
    {
        cout<<a[j][i]<<" ";
    }
    cout<<endl;
}

}
