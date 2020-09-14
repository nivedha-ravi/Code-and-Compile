/*
Example Input/Output 1:
Input:
12:10
Output:
12:21
Explanation:
Here the time T = 12:10, so the next palindromic time is 12:21.
The reverse of 12:21 is equal to the same time itself.
So 12:21 is printed as the output.
Example Input/Output 2:
Input:
05:55
Output:
10:01
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.next().split(":");
        int hh=Integer.parseInt(s[0]),mm=Integer.parseInt(s[1]);
        mm++;
        for(;hh<24;hh++){
            int c=0,k=0;
            for(;mm<60;mm++){
                String d="",g="",h="";
                if(mm<10) g="0"+mm;
                else g+=mm;
                if(hh<10){
                    d+="0"+hh+g;
                    h="0"+hh;
                }else{
                    d+=hh+g;
                    h+=hh;
                }
                StringBuilder a=new StringBuilder(d);
                String f=a.reverse().toString();
                if(d.equals(f)){
                    System.out.print(h+":"+g);
                    return;
                }
            }
            mm=0;
        }
        System.out.print("00:00");
	}
}
