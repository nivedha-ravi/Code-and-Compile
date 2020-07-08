/*
INPUT:
abcbadcd
OUTPUT:
abcddcba
abdccdba
acbddbca
acdbbdca
adbccbda
adcbbcda
bacddcab
badccdab
bcaddacb
bcdaadcb
bdaccadb
bdcaacdb
cabddbac
cadbbdac
cbaddabc
cbdaadbc
cdabbadc
cdbaabdc
dabccbad
dacbbcad
dbaccabd
dbcaacbd
dcabbacd
dcbaabcd
INPUT:
abcdea
OUTPUT:
-1
*/
import java.util.*;
public class Hello {

    public static boolean check(char a[],Set<String> k){
        String s=new String(a);
        StringBuilder sb=new StringBuilder(s);
        if(s.equals(sb.reverse().toString())){
            k.add(s);
            return true;
        }
        return false;
    }
    public static void swap(char a[],int l,int r){
        char t=a[l];
        a[l]=a[r];
        a[r]=t;
    }
    public static void pali(char a[],int l,int r,Set<String> set){
        if(l==r){
            if(check(a,set)){
                //System.out.println(Arrays.toString(a));
                return;
            }
        }
        for(int i=l;i<=r;i++){
            swap(a,l,i);
            pali(a,l+1,r,set);
            swap(a,l,i);
        }
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		char a[]=sc.next().toCharArray();
		Set<String> set =new TreeSet<>();
		pali(a,0,a.length-1,set);
		if(set.size()==0){
		    System.out.println(-1);
		    return;
		}
		for(String i:set){
		    System.out.println(i);
		}

	}
}
