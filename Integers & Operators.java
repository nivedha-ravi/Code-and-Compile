/*
INPUT:
7
10 5 8 15 68 10 3
++*/*/
OUTPUT:
16
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      String str=in.next();
      char[] ch=str.toCharArray();
      int res=a[0];
      for(int i=1,k=0;i<n;i++,k++)
      {
        if(ch[k]!='\0')
        {
          if(ch[k]=='+')
          {
            res+=a[i];
          }
          else if(ch[k]=='-')
          {
            res-=a[i];
          }
          else if(ch[k]=='*')
          {
            res*=a[i];
          }
          else if(ch[k]=='/')
          {
            res/=(int)a[i];
          }
        }
      }
      System.out.print((int)res);
      }
      }
