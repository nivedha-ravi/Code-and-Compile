/*input: 5
1 5 0 4 6
output: 6
*/

import java.util.*;
public class Hello {
public static boolean fibo(int n){
    int a=0,b=1,c;
    if(n==0){
        return true;
    }
    for(int i=2;;i++){
        c=a+b;
        a=b;
        b=c;
        if(c==n){
            return true;
        }
        if(c>n){
            break;
        }
    }
    return false;
}
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int p=0,sum=0;
        for(int i=0;i<n;i++){
            int x=a[i];
            if(fibo(x)){
                sum+=x;
                p=1;
            }
        }
        if(p==1){
            System.out.print(sum);
        }else{
            System.out.print("-1");
        }
    }
}
