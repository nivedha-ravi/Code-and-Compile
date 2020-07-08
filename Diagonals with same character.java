/*
input: 4 4
u m o a
h n a o
y h r w
b n h e
output: 4
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int row=sc.nextInt(),col=sc.nextInt(),i,j,cnt=2,k=0;
	char ch[][]=new char[row][col];
    Set<Character> set=new HashSet<>();
	for(i=0;i<row;i++){
    for(j=0;j<col;j++)
    ch[i][j]=sc.next().charAt(0);}
    for(i=col-2;i>=0;i--){
    for(j=i,k=0;j<col;j++,k++)
    {
if(k<row){set.add(ch[k][j]);}
        else break;
    }
    if(set.size()==1)cnt++;
        set.clear();

    }
    for(i=1;i<row-1;i++){set.clear();
    for(j=i,k=0;j<row;j++,k++){
        if(k<col){
            set.add(ch[j][k]);}
        else
        break;
    }
    if(set.size()==1)cnt++;
    }
    System.out.println(cnt);


	}
}
