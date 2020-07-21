/*
Example Input/Output 1:
Input: 7
22 43 56 51 68 50 28
Output:
56 43 22 51 50 68 28
Explanation:
There are two even integer pairs in the given integers.
The first even integer pair is 22 and 56.
After swapping, the integers become 56 43 22 51 68 50 28.
The second even integer pair is 68 and 50.
After swapping, the integers become 56 43 22 51 50 68 28.
Hence the output is 56 43 22 51 50 68 28
Example Input/Output 2:
Input: 6 2 8 3 12 98 56
Output: 8 2 3 98 12 56
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                for(int j=i+1;j<n;j++){
                    if(a[j]%2==0){
                        int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                        i=j;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
	}
}
