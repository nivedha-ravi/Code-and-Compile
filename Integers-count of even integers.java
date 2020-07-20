/*
Example Input/Output 2:
Input: 5234
Output: 6
Explanation:
All possible even integers that can be formed from the digits of 5234 are given below.
52
5234
2
234
34
4
The number of possible even integers is 6.
So 6 is printed as the output.
Example Input/Output 2:
Input: 20406
Output: 9
Explanation:
All possible even integers that can be formed from the digits of 20406 are given below.
2
20
204
2040
20406
4
40
406
6
The number of possible even integers is 9.
So 9 is printed as the output.
Example Input/Output 3:
Input: 2424
Output: 10
*/import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char s[]=s1.toCharArray();
        int n=s.length,f=0,c=0;
        for(int i=0;i<n;i++){
            String a="";
            a+=s[i];
            for(int j=i+1;j<n;j++){
                a+=s[j];
                if(a.charAt(0)=='0'){
                    continue;
                }
                else if(Integer.parseInt(a)%2==0){
                    c++;
                }
            }
        }
        int x=Integer.parseInt(String.valueOf(s));
        while(x!=0){
            int r=x%10;
            if(r!=0 && r%2==0){
                c++;
            }
            x/=10;
        }
        System.out.print(c);
	}
