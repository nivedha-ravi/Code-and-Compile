/*
Example Input/Output 1:
Input:
He wore a turban made of gold
He was a young man of great promise
2
Output:
He of
Explanation:
The common words of size 2 in both the string values are He and of.
Hence the output is He of.
Example Input/Output 2:
Input:
the cat is under the bed
the Cat is beside the table
3
Output:
the
Example Input/Output 3:
Input:
If you want to build a solid structure
you need to put down the first few blocks in the right place
4
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(" ");
        String b[]=sc.nextLine().split(" ");
        ArrayList<String> g=new ArrayList<String>();
        int n=sc.nextInt(),c=0;
        for(int i=0;i<a.length;i++){
            if(!(g.contains(a[i]))){
                for(int j=0;j<b.length;j++){
                    if(a[i].equals(b[j])  && a[i].length()==n){
                        System.out.print(a[i]+" ");
                        g.add(b[j]);
                        c=1;
                        break;
                      }
                 }
            }
        }
        if(c==0)
        System.out.print("-1");
	  }
}
