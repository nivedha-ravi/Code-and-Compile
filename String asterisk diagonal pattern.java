/*
INPUT:
skillrack
OUTPUT:
s***r
*k*a*
**i**
*c*l*
k***l
*/
import java.util.*;
public class Hello {
    public static int getCol(int length){
        if(length%2==0 && (length/2)%2!=0)
        return (length/2)+1;
        else if(length%2==0 && (length/2)%2==0)
        return length/2;
        return (length+1)/2;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		int length=str.length();
		int row=(length+1)/2;
		int col=getCol(length);
		char arr[][]=new char[row][col];
		int ctr=0,tempRow=row-1;
		for(int R=0;R<(row+1)/2;R++)
		{
		    if(ctr<length)
		    for(int C=0;C<col;C++)
		    {
		        if((R==C || R+C==col-1) && ctr<length)
		        arr[R][C]=str.charAt(ctr++);
		        else
		        arr[R][C]='*';
		    }
		    if(ctr<length){
		    for(int C=col-1;C>=0;C--)
		    {
		        if((R==C || R+C==col-1) && ctr<length)
		        arr[tempRow][C]=str.charAt(ctr++);
		        else
		        arr[tempRow][C]='*';
		    }
		    tempRow--;
		    }
		}
		for(int R=0;R<row;R++)
		{
		    for(int C=0;C<col;C++)
		    {
		        System.out.print(arr[R][C]);
		    }
		    System.out.println();
		}
	}
}
