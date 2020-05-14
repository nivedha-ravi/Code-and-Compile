#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int total,stud,count=0;
cin>>total>>stud;
int t,m,hh,mm;
char ch;
cin>>t>>ch>>m;
for(int i=0;i<total;i++)
{
    cin>>hh>>ch>>mm;
    if(t>hh)
    {
        count++;
    }
    else if(t==hh)
    {
        if(m>=mm)
        {
            count++;
        }
    }
}
if(count>=stud)
{
    cout<<"No";
}
else
{
    cout<<"Yes";
}

}
