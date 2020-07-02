/*
INPUT:
8
99 58 28 33 90 30 81 64
2 2
OUTPUT:
28 33 90 30 81 64
90 30 81 64
81 64
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
	 Scanner sc=new Scanner( System .in);
	 int n=sc.nextInt();
	 List<Integer> al=new ArrayList<>();
	 for(int i=0;i<n;i++)
	 al.add(sc.nextInt());
	 int r=sc.nextInt();
	 int x=sc.nextInt();
	 while(n>x){
	     Collections.rotate(al,r*-1);
	     for(int i=0;i<x;i++)
	     al.remove(al.size()-1);
	     for(int i:al)
	     System.out.print(i+" ");
	     System.out.println();
	     n=n-x;
	 }

	}
}
