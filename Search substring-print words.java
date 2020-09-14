/*
Example Input/Output 1:
Input:
learning makes a good man better and a bad man worse
4
k
ea
ma
a
Output:
makes
learning
makes man man
learning makes a man and a bad man
Explanation:
The 1st string is k, the word that contains the substring k in the string S is makes.
The 2nd string is ea, the word that contains the substring ea in the string S is learning.
The 3rd string is ma, the words that contain the substring ma in the string S are makes, man and man.
The 4th string is a, the words that contain the substring a in the string S are learning, makes, a, man, and, a, bad and man.
Example Input/Output 2:
Input:
programming is an explanatory activity
5
o
al
i
an
ing
Output:
programming explanatory
-1
programming is activity
an explanatory
programming
Example Input/Output 3:
Input:
enter green rocking cooking clean terminate backward eat
6
e
king
en
g
ter
ooo
Output:
enter green clean terminate eat
rocking cooking
enter green
green rocking cooking
enter terminate
-1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(" ");
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            int p=0;
            for(int j=0;j<a.length;j++){
                if(a[j].contains(s[i])){
                    System.out.print(a[j]+" ");
                    p=1;
                }
            }
            if(p==0) System.out.println("-1");
            else System.out.println();
        }
	  }
}
