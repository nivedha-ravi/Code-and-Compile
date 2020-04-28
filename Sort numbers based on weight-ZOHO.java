//*
Rules To Calculate Weight:
*5 if a perfect square
*4 if a multiple of 4 and divisible by 6
*3 if an even number
INPUT:
5
10
36
54
49
12
OUTPUT:
36
12
49
54
10
*//
import java.util.*;

public class Hello {


    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);

         int n=sc.nextInt();

        int[] arr=new int[n];

        int[] wt=new int[n];

        int[] ip=new int[n];

        int i,j=0;

        for(i=0;i<n;i++)

             ip[i]=sc.nextInt();

        Arrays.sort(ip);

        for(i=n-1;i>=0;i--)

             arr[j++]=ip[i];

        for(i=0;i<n;i++)

         {

             wt[i]=0;

             int sq=(int)Math.sqrt(arr[i]);

             if((sq*sq)==arr[i])

                 wt[i]+=5;

            if((arr[i]%6==0)&&(arr[i]%4==0))

                 wt[i]+=4;

             if(arr[i]%2==0)

                 wt[i]+=3;

         } 

         int t,temp;

            for(i=0;i<n-1;i++)

                {

                    for(j=0;j<n-i-1;j++)

                        {

                            if(wt[j]<wt[j+1])

                            {

                               t=wt[j];

                               wt[j]=wt[j+1];

                               wt[j+1]=t;

                               temp=arr[j];

                               arr[j]=arr[j+1];

                                arr[j+1]=temp;

                            }

                        }
            for(i=0;i<n;i++)
                System.out.print(arr[i]+" ");
}
}