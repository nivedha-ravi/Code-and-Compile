/*
input: 5 3
1 2 1 3 1
output:
2 3 1

input: 12 5
7 8 10 8 7 6 6 4 2 1 1 10
output:
6 4 2 1 10
*/ 
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		List<Integer>l=new ArrayList<>();
		for(int i=0;i<N;i++){
		    int num=sc.nextInt();
		    if(l.size()<K){
		        if(l.contains(num)){
		            l.remove(l.indexOf(num));
		        }
		        l.add(num);
		    }
		    else{
		        if(l.contains(num)){
		            l.remove(l.indexOf(num));
		        }
		        else{
		            l.remove(0);
		        }
		        l.add(num);
		    }
		}
		for(Integer i:l){
		    System.out.print(i+" ");
		}

	}
}
