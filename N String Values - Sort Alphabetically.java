/*
INPUT:
7
abcd
edca
abcd
edca
abcd
some
abcd
OUTPUT:
4
abcd 1 3 5 7
edca 2 4
some 6
INPUT:
4
ijk
ghi
klm
mno
OUTPUT:
4
ijk 1
ghi 2
klm 3
mno 4
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	sc.nextLine();
	String str[]=new String[N];
	Set<String> set=new TreeSet<>();
	for(int i=0;i<N;i++){
	    str[i]=sc.next();
	    set.add(str[i]);
	}
	System.out.println(set.size());
	for(String s:set){
	    System.out.print(s+" ");
	    for(int i=0;i<N;i++){
	        if(s.equals(str[i]))
	        System.out.print((i+1)+" ");
	    }
	    System.out.println();
	}

	}
}
