/*
Example Input/Output 1:
Input:
telephone
phone
3
Output:
hon one pho
Explanation:
Here X = 3.
The common substring values of length 3 in the string values telephone and phone are pho, hon and one.
After sorting the common substring values in ascending order, the substring values become hon, one and pho.
Example Input/Output 2:
Input:
ENVIRONMENT
education
2
Output: -1
Example Input/Output 3:
Input:
SkillRack
SkillSkillRack
2
Output:
Ra Sk ac ck il ki lR ll
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine()
    String s2 = sc.nextLine();
		int x = sc.nextInt();
		List<String> l = new ArrayList<>();
		for(int i = 0;i <= s1.length()-x; i++) {
		    String k = s1.substring(i,i+x);
		    if(s2.contains(k))
		    l.add(k);
		}
	  Collections.sort(l);
    if(l.size() == 0){
      System.out.print("-1");
    }else {
        for(String i : l)
        System.out.print(i+" ");
    }
	}
}
