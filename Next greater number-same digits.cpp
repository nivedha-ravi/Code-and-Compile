#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int i,l,j,k,m;
string s;
cin>>s;
l=s.length();
vector<int>a(l);
for(i=0;i<l;i++)
{
    a[i]=s[i]-'0';
}
for(i=l-1;i>0;i--)
{
    for(j=i-1;j>=0;j--)
    {
        if(a[i]>a[j])
        {
            a[i]=a[i]+a[j]-(a[j]=a[i]);
            for(k=j+1;k<l;k++)
            {
                for(m=k+1;m<l;m++)
                {
                    if(a[k]>a[m])
                    {
                        a[k]=a[k]+a[m]-(a[m]=a[k]);
                    }
                }
            }
            goto x;
        }
    }
}
x: for(i=0;i<l;i++)
{
    cout<<a[i];
}


}
