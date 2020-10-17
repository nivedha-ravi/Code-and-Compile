/*
Example Input/Output 1:
Input:
JAKE RAVI ABDUL AYSHA DIYA
A98L J76E A100A D88A R91I
Output:
JAKE 76
RAVI 91
ABDUL 98
AYSHA 100
DIYA 88
Explanation:
The 1st student name is JAKE and his marks match J76E.
The 2nd student name is RAVI and his marks match R91I.
The 3rd student name is ABDUL and his marks match A98L.
The 4th student name is AYSHA and her marks match A100A.
The 5th student name is DIYA and her marks match D88A.
Hence the output is
JAKE 76
RAVI 91
ABDUL 98
AYSHA 100
DIYA 88
Example Input/Output 2:
Input:
JOSHUA SANJU RAJU SAM FATHIMA ISHAAN
I98N S66U S99M R56U J90A F81A
Output:
JOSHUA 90
SANJU 66
RAJU 56
SAM 99
FATHIMA 81
ISHAAN 98
Example Input/Output 3:
Input:
ABI JEMI DEVI
J91I A100I D95I
Output:
ABI 100
JEMI 91
DEVI 95
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        String a[]=sc.nextLine().split(" ");
        for(int i=0;i<s.length;i++){
            String d=s[i];
            for(int j=0;j<a.length;j++){
                String f=a[j];
                if(d.charAt(0)==f.charAt(0) && d.charAt(d.length()-1)==f.charAt(f.length()-1)){
                    System.out.println(d+" "+f.substring(1,f.length()-1));
                    break;
                }
            }
        }
	}
}
