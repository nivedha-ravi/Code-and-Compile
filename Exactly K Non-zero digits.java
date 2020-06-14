/*
INPUT:
100 200 2
OUTPUT:
101 102 103 104 105 106 107 108 109 110 120 130 140 150 160 170 180 190
INPUT:
500 510 3
OUTPUT:-1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int k=in.nextInt();
		int flag=0;
		for(int i=x;i<=y;i++)
		{
		    int temp=i,count=0;
		    while(temp>0)
		    {
		        if(temp%10!=0)
		        {
		            count++;
		        }
		        temp/=10;
		    }
		    if(count==k)
		    {
		        System.out.print(i+" ");
		        flag=1;
		    }
		}
		if(flag==0)
		{
		    System.out.print("-1");
		}


	}
}
