#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n;
cin>>n;
int ctr=0,car,fuel,dist;
float maxavg=0.0;
while(ctr<n)
{
    cin>>fuel>>dist;
    float avg=dist/fuel;
    if(ctr==0)
    {
        maxavg=avg;
        car=ctr+1;
    }
    else
    {
        if(maxavg<avg)
        {
            maxavg=avg;
            car=ctr+1;
        }
    }
    ctr++;
}
cout<<car;
}
