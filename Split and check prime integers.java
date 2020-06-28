/*input: 133
output: 13 3
input: 5814
output: -1
input: 7181
output: 7 181
*/

import java.util.*;
public class Hello {
public static boolean isprime(int a){
    if(a==1){
        return false;
    }
    else if(a==2){
        return true;
    }else if(a%2==0){
        return false;
    }
    for(int i=3;i*i<=a;i+=2){
        if(a%i==0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length(),p=0;
        for(int i=0;i<l-1;i++){
            String a=s.substring(0,i+1);
            String b=s.substring(i+1,l);
            int v=Integer.parseInt(a);
            int u=Integer.parseInt(b);
            if(isprime(v) && isprime(u)){
                System.out.print(v+" "+u);
                p=1;
                break;
            }
        }
        if(p==0){
            System.out.print("-1");
        }
    }
}
