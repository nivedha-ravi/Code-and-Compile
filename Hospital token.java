/*
 Input:
 5
 Sandy 09:30
 Joel 11:15
 Priya 21:00
 Abdul 13:46
 Kapli 13:45
 Output:
 Sandy 1
 Joel 2
 Kapli 3
 Abdul 4
 Priya 5
 Explanation:
 The tokens are provided based on the entry time of the patients.
 The patient Sandy entered the hospital at 09:30, so he has the token 1.
 The patient Joel entered the hospital at 11:15, so he has the token 2.
 The patient Kapli entered the hospital at 13:45, so he has the token 3.
 The patient Abdul entered the hospital at 13:46, so he has the token 4.
 The patient Priya entered the hospital at 21:00, so she has the token 5.
 Hence the output is Sandy 1 Joel 2 Kapli 3 Abdul 4 Priya 5
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s[]=new String[n];
		String names[]=new String[n];
		int hour[]=new int[n];
		int min[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    names[i]=in.next();
		    s[i]=in.next();
		    String[] str=s[i].split(":");
		    hour[i]=Integer.parseInt(str[0]);
		    min[i]=Integer.parseInt(str[1]);
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(hour[i]>hour[j])
		        {
		            int temp=hour[i];
		            hour[i]=hour[j];
		            hour[j]=temp;
		            int temp1=min[i];
		            min[i]=min[j];
		            min[j]=temp1;
		            String sti=names[i];
		            names[i]=names[j];
		            names[j]=sti;
		        }
		        if(hour[i]==hour[j])
		        {
		            if(min[i]>min[j])
		            {
		                int temp=min[i];
		                min[i]=min[j];
		                min[j]=temp;
		                String sti=names[i];
		                names[i]=names[j];
		                names[j]=sti;
		            }
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println(names[i]+" "+(i+1));
		}


	}
}
