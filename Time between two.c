/*
Input:
11:59:55
12:00:05
Output:
11:59:55
11:59:56
11:59:57
11:59:58
11:59:59
12:00:00
12:00:01
12:00:02
12:00:03
12:00:04
12:00:05
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int hh,hh1,mm,mm1,ss,ss1;
scanf("%d:%d:%d\n%d:%d:%d",&hh,&mm,&ss,&hh1,&mm1,&ss1);
int hctr=hh,mctr=mm,sctr=ss;
int maxmin,maxsec;
for(;hctr<=hh1;hctr++)
{
    maxmin=(hctr==hh1)?mm1:59;
    for(;mctr<=maxmin;mctr++)
    {
        maxsec=(hctr==hh1 && mctr==mm1)?ss1:59;
        for(;sctr<=maxsec;sctr++)
        {
            printf("%02d:%02d:%02d\n",hctr,mctr,sctr);
        }
        sctr=0;
    }
    mctr=0;
}

}
