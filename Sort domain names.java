/*
Example Input/Output 1:
Input: 5
abc@gmail.com
koolguy@yahoo.com
mno@gmail.com
manjara@gmail.com
haven@live.com
output:
gmail.com
live.com
yahoo.com
Explanation:
3 students have the email addresses at "gmail.com".
1 student has the email address at "live.com".
1 student has the email address at "yahoo.com".
The most used domain name is gmail.com, so it is printed first.
The domains yahoo.com and live.com have the same usage count, so their names are printed in ascending order.
Example Input/Output 2:
Input: 5
xyz@gmail.com
fun4ever@outlook.com
sweetcandy@yahoo.com
mrabc@gmail.com
comichero@live.com
Output:
gmail.com
live.com
outlook.com
yahoo.com
Example Input/Output 3:
Input: 4
AtoZ@gmail.com
viten123@rocketmail.com
HELLOMR@live.com
Master@outlook.com
Output:
gmail.com
live.com
outlook.com
rocketmail.com
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            String str[]=sc.next().split("@");
            a[i]=str[1];
        }
        int c,k=0,l=0,h=0;
        int r[]=new int[n];
        String d[]=new String[n];
        String b[]=new String[n];
        for(int i=0;i<n;i++){
            c=1;
            if(a[i]!=""){
                for(int j=i+1;j<n;j++){
                    if(a[i].equals(a[j])){
                        c++;
                        a[j]="";
                    }
                }
                d[l++]=a[i];
                r[h++]=c;
            }
        }
        for(int i=0;i<h;i++){
            for(int j=i+1;j<h;j++){
              if(r[i]==r[j]){
                  if(d[i].compareTo(d[j])>0){
                      String z=d[i];
                      d[i]=d[j];
                      d[j]=z;
                  }
              }
              else if(r[i]<r[j]){
                    int u=r[i];
                    r[i]=r[j];
                    r[j]=u;
                    String s=d[i];
                    d[i]=d[j];
                    d[j]=s;
                }
            }
        }
        for(int i=0;i<l;i++){
            System.out.println(d[i]);
        }
	  }
}
