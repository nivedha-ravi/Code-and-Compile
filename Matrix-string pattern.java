/*
Example Input/Output 1:
Input:
teen meal neam lift
t e e n
f c e e
i u g a
l a e m
Output: Yes
Explanation:
The four string values are teen, meal, neam and lift.
The four boundaries of the matrix are highlighted below.
t e e n
f c e e
i u g a
l a e m
The first row representing the string teen.
The last column representing the string neam.
The last row representing the string meal.
The first column representing the string lift.
So Yes is printed as the output.
Example Input/Output 2:
Input:
HELLO HOBBY PENNY PHOTO
O T O H P
L E R T E
L X F B N
E T U I N
H O B B Y
Output: Yes
Example Input/Output 3:
Input:
gifty horse gorch EASSY
g i f t Y
o v e r S
r r t y S
c e t t A
h o r s E
Output: No
*/

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		List<String> al=new ArrayList<>();
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		int l=al.get(0).length();
		char[][] mat=new char[l+1][l+1];
		for(int row=0;row<l;row++)
		{
		    for(int col=0;col<l;col++)
		    {
		        mat[row][col]=sc.next().charAt(0);
		    }
		}
		StringBuilder sb1=new StringBuilder();
		for(int col=1;col<=l;col++)
		sb1.append(mat[1][col]);

		StringBuilder sb2=new StringBuilder();
		for(int row=1;row<=l;row++)
		sb2.append(mat[row][l]);

		StringBuilder sb3=new StringBuilder();
		for(int col=l;col>=1;col--)
		sb3.append(mat[l][col]);

		StringBuilder sb4=new StringBuilder();
		for(int row=l;row>=1;row--)
		sb4.append(mat[row][1]);

		if((al.contains(sb1.toString())||al.contains(sb1.reverse().toString()))&&(al.contains(sb2.toString())||al.contains(sb2.reverse().toString()))&&(al.contains(sb3.toString())||al.contains(sb3.reverse().toString()))&&(al.contains(sb4.toString())||al.contains(sb4.reverse().toString())))
		System.out.print("Yes");
		else
		System.out.print("No");
	}
}
