/*
INPUT:
meome
OUTPUT:
YES
INPUT:
asdfsdf
OUTPUT:
YES
INPUT:
lioelin
OUTPUT:
NO
*/ 
import java.util.*;
public class Hello {
    public static boolean check(String str,int n){
        String f="",s="";
        for(int i=0;i<n/2;i++){
            f+=str.charAt(i);
        }
        for(int i=n/2;i<n;i++){
            s+=str.charAt(i);
        }
        if(f.equals(s)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		String s=sc.next();
		int len=s.length();
		for(int i=0;i<len;i++){
		String str="";
		    for(int j=0;j<len;j++){
    		    if(j!=i){
    		        str+=s.charAt(j);
    		    }
		    }
    		if(check(str,len-1)){
    		    System.out.print("YES");
    		    flag=1;
    		    System.exit(0);
    		}
		}
		if(flag==0){
		    System.out.print("NO");
		}
	}
}
