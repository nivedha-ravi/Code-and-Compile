'''
Example Input/Output 1:
Input: 137 4276
Output: 1234776
Explanation:
The smallest possible even integer using all the digits in 137 and 4276 is 1234776.
Hence the output is 1234776
Example Input/Output 2:
Input: 1357 97531
Output: -1
Example Input/Output 3:
Input: 3004 560
Output: 3000456
'''

a,b=input().split()
n=sorted(a+b)
z=n.count("0")
n=n[z:]
for i in range(z):
    n.insert(1,"0")
eve="-1"
for j in "86420":
    if j in n:
        n.remove(j)
        eve=j
        break
if eve=="-1":
    print(-1)
else:
    print(''.join(n)+eve)



#include<stdio.h>
#include <stdlib.h>
int hasEven(long long int n)
{
    // check whether there is atleast one even digit
    while(n!=0)
    {
        if((n%10)%2==0) return 1;
        n/=10;
    }
    return 0;
}
int digitCount(long long int n)
{
    // counts the number of digits in n
    int c=0;
    while(n!=0)
    {
        c++;
        n/=10;
    }
    return c;
}
int freq(long long int n)
{
    int arr[10];
    for(int i=0;i<10;i++)
    {
        arr[i]=1;
    }
    // finding frequecny of all digits in long int n
    while(n!=0)
    {
        arr[n%10]++;
        n/=10;
    }
    long long int l = 0;
    // converting the freq array into long int
    for(int i=0;i<10;i++)
    {
        l=l*10+(arr[i]);
    }
    return l;
}
long long int minNumber(int arr[20],int k)
{
    long long int l = 0;
    // sorting the array arr
    for(int i=0;i<k-1;i++)
    {
        for(int j=0;j<k-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    // if zero is present in the first index we move it back
    if(arr[0] == 0)
    {
        for(int j=0;j<k;j++)
        {
            if(arr[j]!=0)
            {
                arr[0] = arr[j];
                arr[j] = 0;
                break;
            }
        }
    }
    // Converting the array elements into integer
    for(int i=0; i<k; i++)
    {
        l = l*10+(arr[i]);
    }
    return l;
}

int main()
{
    int X,Y,k=0;
    scanf("%d %d",&X,&Y);
    int arr[20];
    while(X!=0)
    {
        arr[k++] = X%10;
        X/=10;
    }
    while(Y!=0)
    {
        arr[k++] = Y%10;
        Y/=10;
    }
    long long int l,i;
    l = minNumber(arr,k);
    if(hasEven(l)==1)
    {
        int digits_in_l = digitCount(l);
        for(i=l;;i++)
        {
            if(freq(i) == freq(l) && i%2==0)
            {
                printf("%lld",i);
                exit(0);
            }
            if(digitCount(i) > digits_in_l) break;
        }
        printf("-1");
    }
    else
    {
        printf("-1");
    }
}
