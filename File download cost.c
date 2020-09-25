/*
Input:
500 50
Output:
29220
Explanation:
The size of the file is 500 MB. The data rate is 50 KB/Sec. After converting 500 MB into KB, it becomes 512000 KB. So the total time to download the file is 10240 seconds. 1 - 500 seconds, the cost is 500 paise. 501 - 1000 seconds, the cost is 1000 paise. > 1000 seconds, the cost is 27720 paise. The total cost is 29220 (27720 + 1000 + 500).
*/


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int size,dr;
    scanf("%d\n%d",&size,&dr);
    int sec=ceil((size*1024.0)/dr);
    int total=0;
    while(sec>1000)
    {
        total+=3;
        sec--;
    }
    while(sec>500)
    {
        total+=2;
        sec--;
    }
    printf("%d",total+sec);

}
