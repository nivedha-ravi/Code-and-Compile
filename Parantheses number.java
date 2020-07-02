/*
INPUT:
(A+B*(c+d)*(e-f))
OUTPUT:
1 2 2 3 3 1
INPUT:
()()(()()((())))
OUTPUT:
1 1 2 2 3 4 4 5 5 6 7 8 8 7 6 3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		Stack<Integer> b=new Stack<>();
		String c="";
		int d=0;
		for(int i=0;i<a.length();i++)
		{
		    if(a.charAt(i)=='(')
		    {
		        d++;
		        b.push(d);
		        c+=d+" ";
		    }
		    else if(a.charAt(i)==')')
		    {
		        c+=b.pop()+" ";
		    }

		}
		System.out.print(c);

	}
}
