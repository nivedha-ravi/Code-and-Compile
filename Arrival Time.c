/*
Arun is working in ABC company. He should be on time to the office. He usually goes by his bike. The program must accept the average speed of the bike, his starting time (in Hours: Minutes) from his home and the distance (in kilometres) to be covered to reach office as the input. The program must check whether he can reach the office before 9:30 A.M or not. If he can reach on or before 9:30 A.M, then the program must print the arrival time as the output. Else after increasing the speed by 20kmph the program must check whether he can reach on or before 9:30 A.M or not. If he can reach on time after increasing the speed then the program must print the recalculated arrival time (after 9:30) as the output. Else the program must print NO as the output.
Input Format:
The first line contains the average speed of the bike, starting time (in Hours: Minutes) and distance to be covered separated by spaces.
Example Input/Output 1:
Input:
60 8:45 40
Output:
9:25
Example Input/Output 2:
Input:
30 9:10 60
Output:
NO
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int speed,hh,mm,dist;
scanf("%d %d:%d %d",&speed,&hh,&mm,&dist);
float avg=(1.0*60)/(float)(speed);
int d=dist*avg;
int dd=mm+d;
int h=hh;
if(dd>=60)
{
    dd=dd%60;
    h=hh+1;
}
if((h==9 && ((dd>=01 && dd<=30)||dd==0) )|| (h==8 && (dd>=01 && dd<=59)||dd==0))
{   if(dd==0)
{
    printf("%d:%02d",h,dd);
}
else
{
    printf("%d:%d",h,dd);
}
}
else
{
    speed=speed+20;
    avg=(1.0*60)/(float)(speed);
    d=dist*avg;
    dd=mm+d;
    h=hh;
    if(dd>=60)
    {
        dd=dd%60;
        h=hh+1;
    }
    if((h==9 && (dd>=01 && dd<=30)||dd==0)||(h==8 && (dd>=01 && dd<=59)||dd==0))
    {   if(dd==0)
        {
            printf("%d:%02d",h,dd);
        }
        else
        {
        printf("%d:%d",h,dd);
        }
    }
    else
    {
        printf("NO");
    }
}
}
