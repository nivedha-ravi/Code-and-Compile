/*
Example Input/Output 1:
Input:
Task
3
S++
S+1
++S
Output:
Taskk
TaskkTaskk
TTaskkTaskk
Explanation:
Here S = Task. After the 1st query S++, the string becomes Taskk.
After the 2nd query S+1, the string becomes TaskkTaskk.
After the 3rd query ++S, the string becomes TTaskkTaskk.
Hence the output is
Taskk
TaskkTaskk
TTaskkTaskk
Example Input/Output 2:
Input:
dove
5
S++
S+1
S++
++S
S+1
Output:
dovee
doveedovee
doveedoveee
ddoveedoveee
ddoveedoveeeddoveedoveee
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),d=s;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String a=sc.next();
            if(a.equals("S++")){
                d+=s.charAt(s.length()-1);
            }else if(a.equals("++S")){
                char e=s.charAt(0);
                String g=d;
                d="";
                d+=e+g;
            }else if(a.equals("S+1")){
                d+=s;
            }
            System.out.println(d);
            s=d;
        }
	}
}
