/*
The runs scored by two cricket players is passed as input.
The program must print the total runs scored by the better player.
The better player is the player with a higher average.
It is not necessary that both the players have played/scored in the same number of matches.
If both the players have same average, then print the runs scored by the player who has the highest total runs.
Boundary Conditions: -
The number of matches played for any player will not exceed 20. - If a negative value is passed as runs scored, then the program output must be INVALIDINPUT.
Input Format:
First line will contain the runs scored by player one. The scores are separated by one or more spaces.
Second line will contain the runs scored by player two. The scores are separated by one or more spaces.
Output Format:
The first line will contain the total runs scored by the player having higher average.
Sample Input/Output:
Example 1:
Input:
20 30 40
50 10
Output:
90
Explanation:
Both the players have same average 30. Hence the output is the highest total runs which is by player 1. (20+30+40 = 90)
Example 2:
Input:
50 60 10 50 40
Output:
90
Example 3:
Input:
40 42 60
0 100 56
Output:
156
Example 4:
Input:
42 -10
22 45
Output:
INVALIDINPUT
Explanation:
As -10 is passed as runs scored in the input, the program must print INVALIDINPUT
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int a[20],b[20];
char s[200],s1[200];
scanf("%[^\n]",s);
scanf("\n");
scanf("%[^\n]",s1);
int len=strlen(s),len1=strlen(s1),k=0,m=0,temp=0;
for(int i=0;i<=len;i++)
{
    if(s[i]=='-')
    {
        printf("INVALIDINPUT");
        return 0;
    }
    else if(isdigit(s[i]))
    {
        temp=(temp*10)+(s[i]-'0');
    }
    else if(s[i]==' ' || s[i]=='\0')
    {
        a[k++]=temp;
        temp=0;
    }
}
for(int i=0;i<=len1;i++)
{
    if(s1[i]=='-')
    {
        printf("INVALIDINPUT");
        return 0;
    }
    else if(isdigit(s1[i]))
    {
        temp=(temp*10)+(s1[i]-'0');
    }
    else if(s1[i]==' '||s1[i]=='\0')
    {
        b[m++]=temp;
        temp=0;
    }
}
int t1=0,t2=0;
float avg1,avg2;
for(int i=0;i<k;i++)
{
    if(a[i]>=0)
    {
        t1+=a[i];
    }

}
for(int j=0;j<m;j++)
{
    if(b[j]>=0)
    {
        t2+=b[j];
    }
}
avg1=t1/k;
avg2=t2/m;
if(avg1==avg2)
{
    int c=(t1>t2)?t1:t2;
    printf("%d",c);
}
else if(avg1>avg2)
{
    printf("%d",t1);
}
else
{
    printf("%d",t2);
}
}
