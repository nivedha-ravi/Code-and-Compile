/*
INPUT:
Japan
OUTPUT:
J p n
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{   int flag=0;
		    if(ch[i]!='\0')
		    {
		    for(int j=i+1;j<ch.length;j++)
		    {
		        if(ch[i]==ch[j])
		        {
		            flag=1;
		            ch[j]='\0';
		        }
		    }
		    if(flag==0)
		    {
		        System.out.print(ch[i]+" ");
		    }
		    }
		}

	}
}
