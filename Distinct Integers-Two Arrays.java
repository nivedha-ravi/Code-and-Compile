/*
INPUT:
10 5
50 40 60 20 20 50 10 50 60 40
45 45 45 50 60
OUTPUT:
10 20 40 45 50 60
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		Set<Integer> a=new HashSet<Integer>();
		Set<Integer> b=new HashSet<Integer>();
		Set<Integer> c=new HashSet<Integer>();
		for(int i=0;i<m;i++)
		{
		    a.add(in.nextInt());
		}
		for(int i=0;i<n;i++)
		{
		    b.add(in.nextInt());
		}
		for(int i:a)
		{
		    c.add(i);
		}
		for(int j:b)
		{
		    c.add(j);
		}
		List<Integer> l=new ArrayList<Integer>(c);
		Collections.sort(l);
		for(int i:l)
		{
		    System.out.print(i+" ");
		}

	}
}
