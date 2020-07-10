/*
Input:
6
Mr.Ahbain USA
Mr.Lee Ming China
Ms.Maa Long China
Mr.Verana Latta India
Ms.Jwlin Rij China
Ms.Abc USA
Output:
China 3
USA 2
India 1
Explanation:
In USA, 2 persons affected by the coronavirus(Mr.Ahbain and Ms.Abc). So the count is 2. In China, 3 persons affected by the coronavirus(Mr.Lee Ming, Ms.Maa Long and Ms.Jwlin Rij). So the count is 3. In India, 1 person affected by the coronavirus(Mr.Verana Latta). So the count is 1. So the names of countries with the number of corona affected persons are printed based on the given conditions. China 3 USA 2 India 1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] cname=new String[n];
		String[] corona=new String[n];
		int[] count=new int[n];
		in.nextLine();
		for(int i=0;i<n;i++)
		{
		   String[] s=in.nextLine().split(" ");
		   cname[i]=s[s.length-1];
		}
		int k=0,p=0;
		for(int i=0;i<n;i++)
		{
		    int c=1;
		    for(int j=i+1;j<n;j++)
		    {
		        if(cname[i].equals(cname[j]))
		        {
		            c++;
		            cname[j]="";
		        }
		    }
		    if(cname[i]!="")
		    {
		        corona[k++]=cname[i];
		        count[p++]=c;
		    }
		}
		for(int i=0;i<k;i++)
		{
		    for(int j=i+1;j<k;j++)
		    {
		        if(count[i]<count[j])
		        {
		            int temp=count[i];
		            count[i]=count[j];
		            count[j]=temp;
		            String temp1=corona[i];
		            corona[i]=corona[j];
		            corona[j]=temp1;
		        }
		    }
		}
		for(int i=0;i<k;i++)
		{
		    System.out.println(corona[i]+" "+count[i]);
		}

	}
}
