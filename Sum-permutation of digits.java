/*
INPUT:
231
OUTPUT:
1332
INPUT:
7865
OUTPUT:
173316
*/
import java.util.*;
public class Hello {
    public static void permute(String prefix,String s,List<Integer> list){
        int l=s.length();
        if(l==0){
            list.add(Integer.parseInt(prefix));
        }else{
            for(int i=0;i<l;i++){
                permute(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1,l),list);
            }
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<Integer> list=new ArrayList<>();
		permute("",s,list);
		long sum=0;
		for(Integer i:list){
		    sum+=i;
		}
		System.out.println(sum);

	}
}
