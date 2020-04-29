Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting .
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".


1
import java.util.Scanner;
2
​
3
public class Solution {
4
    static boolean isAnagram(String a, String b) {
5
        String aa=a.toLowerCase();
6
        String bb=b.toUpperCase();
7
        char ch1[]=aa.toCharArray();
8
        char ch2[]=bb.toCharArray();
9
        int count[]=new int[26];
10
        int n=ch1.length;
11
        int m=ch2.length;
12
        if(n!=m)
13
        {
14
            return false;
15
        }
16
        for(int i=0;i<n;i++)
17
        {
18
            count[ch1[i]-97]++;
19
            count[ch2[i]-97]--;
20
        }
21
        for(int i=0;i<26;i++)
22
        {
23
            if(count[i]!=0)
24
            {
25
                return false;
26
            }
27
        }
28
        return true;
29
    }
30
    public static void main(String[] args) {
31

32
        Scanner scan = new Scanner(System.in);
33
        String a = scan.next();
34
        String b = scan.next();
35
        scan.close();
36
        boolean ret = isAnagram(a, b);
37
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
38
    }
39
}
