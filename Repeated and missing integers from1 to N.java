/*
Example Input/Output 1:
Input: 3 1 2 5 3
Output: 3 4
Explanation:
The given integers are 3 1 2 5 3.
The largest integer is 5, so N = 5.
The repeated integer between 1 to 5 is 3.
The missing integer between 1 to 5 is 4.
Hence the output is 3 4
Example Input/Output 2:
Input: 9 3 4 5 6 8 2 5 1 10
Output: 5 7
Example Input/Output 3:
Input: 14 15 8 9 2 1 7 3 2 4 5 6 11 12 13
Output: 2 10
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int r=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    r=a[i];
                    if(i==0){
                        a[j]=-1;
                    }else{
                        a[i]=-  1;
                    }
                    break;
                }
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(a[i]!=-1)
            res+=a[i];
        }
        int fin=0;
        for(int i=a[0];i<=a[n-1];i++){
            fin+=i;
        }
        int ans=fin-res;
        if(ans==0){
            ans=a[0]-1;
        }
        System.out.print(r+" "+ans);
	}
}
