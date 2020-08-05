/*
input: 6
output:
-6
--1
--2
---1
---2
--3
---1
---3
--6
input: 7
output:
-7
--1
--7
input: 8
output:
-8
--1
--2
---1
---2
--4
---1
---2
----1
---4
--8
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("-"+n);
		findFactors(n,"--");
	}
	static void findFactors(int n,String temp){

	    for(int i=1;i<=n;i++){
	        if(i==1 || i==n){
	            System.out.println(temp+""+i);
	        }
	        else if(n%i==0){
	            System.out.println(temp+""+i);
	            findFactors(i,temp+"-");
	        }
	    }
	}
}
