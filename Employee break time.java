/*
Example Input/Output 1:
Input: 2
09:30 11:30
11:45 14:00
Output:
0 Hours 15 Minutes
Explanation: Here N = 2.
The opening time of the office is 09:30.
The closing time of the office is 14:00.
In the first record, the employee will be inside the office for 2 Hours 0 Minutes.
In the second record, the employee will be inside the office for 2 Hours 15 Minutes.
The total duration the employee takes the break is 0 Hours 15 Minutes.
Hence the output is 0 Hours 15 Minutes
Example Input/Output 2:
Input: 4
08:00 10:10
10:30 13:50
14:30 17:15
17:25 19:11
Output:
1 Hour 10 Minutes
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ansh = 0 ;
		int ansm = 0 ;
		int lasth = 0 ;
		int lastm = 0 ;
		for(int i = 0 ; i < n ; i++){
		    String temp[] = sc.next().split(":");
		    int curh = Integer.valueOf(temp[0]);
		    int curm = Integer.valueOf(temp[1]);
		    if (i!=0){
		        if (curm<lastm){
		            lasth++;
		            curm+=60;
		        }
		        ansm +=(curm-lastm);
		        ansh+=(curh-lasth);
		    }
		    temp = sc.next().split(":");
		    lasth = Integer.valueOf(temp[0]);
		    lastm = Integer.valueOf(temp[1]);
		}
		if (ansm>60){
		    ansh+=ansm/60;
		    ansm%=60;
		}
		if (ansh==1)
		    System.out.printf("%d Hour %d Minutes", ansh , ansm);
		else
        System.out.printf("%d Hours %d Minutes",ansh , ansm);
	}
}


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,a,b,sum=0;
    scanf("%d",&n);
    int arr[n],brr[n],acome[n],bcome[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d:%d %d:%d",&acome[i],&bcome[i],&arr[i],&brr[i]);
    }

    for(int i=0;i<n-1;i++)
    {
        int hr=arr[i]-acome[i+1];
        int min=brr[i]-bcome[i+1];
        sum+=abs((hr*60)+min);
    }
    int hour=sum/60;
    int min=sum%60;
    if(hour==1)
    printf("%d Hour %d Minutes",hour,min);
    else
    printf("%d Hours %d Minutes",hour,min);

}
