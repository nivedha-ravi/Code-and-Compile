/*input: 3
output:33
input: 10
output:3773
series: 3 7 33 77 333 373 737 777 3333 3773 7777 nd so on
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum,count=0,p=0,k=0;
        int fin[]=new int[100];
        for(int i=1;;i++){
            int t=i;
            sum=0;
            while(t>0){
                sum=sum*10+(t%10);
                t/=10;
            }
            if(sum==i){
                int a=sum,b=0,c=0;
                while(a>0){
                    b++;
                    int r=a%10;
                    if(r==3||r==7){
                        c++;
                    }
                    a/=10;
                }
                if(b==c){
                    fin[k++]=i;
                    count++;
                    if(count==n){
                        System.out.print(fin[k-1]);
                        p=1;
                    }
                }
            }
            if(p==1){
                break;
            }
        }
    }
}
