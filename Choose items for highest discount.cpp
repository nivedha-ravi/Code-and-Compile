#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int n,ctr=0,price,discount,lowestdis=0;
cin>>n;
string item,lowestdisitemname;
while(ctr<n)
{
    cin>>item>>price>>discount;
    int currdisamt=price*discount/100;
    if(ctr==0)
    {
        lowestdisitemname=item;
        lowestdis=currdisamt;
    }
    else
    {
        if(currdisamt<lowestdis)
        {
            lowestdis=currdisamt;
            lowestdisitemname=item;
        }
    }
    ctr++;
}
cout<<lowestdisitemname;


}
