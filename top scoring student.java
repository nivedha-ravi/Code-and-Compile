"""
INPUT:
4
Sasikumar:50:60:70
Arun:60:40:90
Manoj:50:50:60
Rekha:60:35:45
OUTPUT:
Arun
"""
import java.util.*;
public class Hello
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int maxavg=0;
String top=" ";
for(int i=0;i<n;i++)
{
  String str=in.next();
  String stud=" ";
  int avg,sum=0;
  String[] st=str.split(":");
  for(int j=0;j<st.length;j++)
  {
    int run=0;
    if(j==0)
    {
      stud=st[j];
    }
    else
    {
      run=Integer.parseInt(st[j]);
      sum+=run;
    }
  }
  avg=sum/3;
  if(avg>maxavg)
  {
    maxavg=avg;
    top=stud;
  }
}

System.out.print(top);
}
}
