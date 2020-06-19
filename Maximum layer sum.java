/*input:4
7 2 4 6
1 3 7 8
6 9 0 1
9 5 2 1
output:
7 2 4 6
1 * * 8
6 * * 1
9 5 2 1
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                m[i][j]=sc.nextInt();
            }
            sc.nextLine();
        }
        int i,j;
        int fr=1,lr=n,fc=1,lc=n;
        int a=0,b=0,c=0,d=0;
        long max=-1,sum;
        while(fr<lr){
            sum=0;
            for(i=fr,j=fc;j<=lc;j++){
                sum=sum+m[i][j];
            }
            for(i=lr,j=fc;j<=lc;j++){
                sum=sum+m[i][j];
            }
            for(j=fc,i=fr;i<=lr;i++){
                sum=sum+m[i][j];
            }
            for(j=lc,i=fr;i<=lr;i++){
                sum=sum+m[i][j];
            }
            sum-=(m[fr][fc]+m[lr][fc]+m[lr][lc]+m[fr][lc]);
            if(sum>max){
                max=sum;
                a=fr;
                b=fc;
                c=lr;
                d=lc;
            }
            fr++;
            fc++;
            lr--;
            lc--;
        }
        int cen=(n/2)+1;
        if((n&1)==1){
            if(m[cen][cen]>max){
                System.out.print(m[cen][cen]+" ");
                System.exit(1);
            }
        }
        for(i=a;i<=c;i++){
            for(j=b;j<=d;j++){
                if(i==a||i==c||j==b||j==d){
                    System.out.print(m[i][j]+" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
	}
