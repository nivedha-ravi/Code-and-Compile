/*
Example Input/Output 1:
Input:
skill____programming________
5
hardworking
rack
good
platform
developement
Output:
2
Explanation:
Here S = skill____programming________ There are 2 slots in the string S and their lengths are 4 and 8. The first slot can be filled with rack or good. The second slot can be filled with platform. Here both the slots are filled with the string values as per the given conditions. Hence the output is 2
Example Input/Output 2:
Input:
cat___lion___tiger________Panda__________
6
Ox
Cat
Mouse
Emu
Elephant
Monkey
Output:
3
Example Input/Output 3:
Input:
#__Apples#__bananas
4 100 12 5000 875
Output:
1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s=in.next().toCharArray();
		int n=in.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    str[i]=in.next();

		}
		int length=s.length,j,res=0;
		for(int i=0;i<length;i++)
		{   int count=0;
		    if(s[i]=='_')
		    {
		        count++;
		    }
		    for(j=i+1;j<length;j++)
		    {
		       if(s[j]=='_')
		       {
		           count++;
		       }
		       else
		       {
		           break;
		       }
		    }
		   if(count>0)
		   {
		       int o=0;
		       for(int k=0;k<n;k++)
		       {
		           int l=str[k].length();
		           if(l==count)
		           {
		               res++;
		               o++;
		               str[k]="";
		               if(o==1)
		               {
		                   break;
		               }
		           }
		       }
		       i=j-1;
		   }
		}
        System.out.print(res);
	}
}
