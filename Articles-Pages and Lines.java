/*
Example Input/Output 1:
Input:
1569
10
50
Output:
4
32
Explanation:
The total number of characters in the article is 1569.
Each page can hold 10 lines.
Each line can hold 50 characters.
The minimum number of pages required to write the article is 4.
The first page contains 500 characters.
The second page contains 500 characters.
The third page contains 500 characters.
The fourth page contains 69 characters.
The minimum number of lines required to write the article is 32.
The first page contains 10 lines.
The second page contains 10 lines.
The third page contains 10 lines.
The fourth page contains 2 lines (where the last line contains 19 characters).
Example Input/Output 2:
Input:
2000
20
100
Output:
1
20
Example Input/Output 3:
Input:
251
5
10
Output:
6
26
*/

import java.util.*;
class Hello
{
    public static void main(String asg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int v=n,h=n,c=0,g=x*y;
        while(h>0){
            c++;
            h-=g;
        }
        int c1=0;
        while(v>=g){
            c1++;
            v-=g;
        }
        c1*=x;
        while(v>0){
            c1++;
            v-=y;
        }
        System.out.println(c);
        System.out.print(c1);
    }
}
