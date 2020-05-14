#include <bits/stdc++.h>

using namespace std;
int isPrime(int a)
{
    for(int i=2;i<a;i++)
    {
        if(a%i==0)
        {
            return 0;
        }
    }
    return 1;
}

int main(int argc, char** argv)
{
int prime[20],even[20],odd[20],p=0,e=0,o=0,num;
while(cin>>num)
{
    if(isPrime(num)==1)
    {
        prime[p++]=num;
    }
    else if(num%2==0)
    {
        even[e++]=num;
    }
    else
    {
        odd[o++]=num;
    }
}
for(int i=0;i<p;i++)
{
    for(int j=i+1;j<p;j++)
    {
        if(prime[i]>prime[j])
        {
            int temp=prime[i];
            prime[i]=prime[j];
            prime[j]=temp;
        }
    }
    printf("%d ",prime[i]);
}
for(int i=0;i<o;i++)
{
    for(int j=i+1;j<o;j++)
    {
        if(odd[i]>odd[j])
        {
            int temp=odd[i];
            odd[i]=odd[j];
            odd[j]=temp;
        }
    }
    printf("%d ",odd[i]);
}
for(int i=0;i<e;i++)
{
    for(int j=i+1;j<e;j++)
    {
        if(even[i]>even[j])
        {
            int temp=even[i];
            even[i]=even[j];
            even[j]=temp;
        }
    }
    printf("%d ",even[i]);
}

}
