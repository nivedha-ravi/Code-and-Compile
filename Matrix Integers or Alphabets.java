import java.util.*;
public class Hello {
    public static boolean isPerfect(int n)
    {
        int sqrt=(int)Math.sqrt(n);
        if(sqrt*sqrt==n)
        {
            return true;
        }
        return false;
    }
    public static void printPattern(int n,char a[])
    {
        char b[][]=new char[n][n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=a[k++];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		char[][] a=new char[r][c];
		char digit[]=new char[r*c];
		char alpha[]=new char[r*c];
		int digitcount=0,alphacount=0;
		int dc=0,ac=0;
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.next().charAt(0);
		        if(Character.isDigit(a[i][j]))
		        {
		            digit[dc++]=a[i][j];
		            digitcount++;
		        }
		        else
		        {
		            alpha[ac++]=a[i][j];
		            alphacount++;
		        }
		    }
		}
		if(isPerfect(digitcount) && isPerfect(alphacount) && (alphacount==digitcount))
		{
		    printPattern((int)Math.sqrt(alphacount),alpha);
		}
		else if(isPerfect(digitcount) && isPerfect(alphacount))
		{
		    int max=(digitcount>alphacount)?digitcount:alphacount;
		    if(max==digitcount)
		    {
		        printPattern((int)Math.sqrt(max),digit);
		    }
		    else
		    {
		        printPattern((int)Math.sqrt(max),alpha);
		    }
		}
		else if(isPerfect(digitcount))
		{
		    printPattern((int)Math.sqrt(digitcount),digit);
		}
		else
		{
		    printPattern((int)Math.sqrt(alphacount),alpha);
		}

	}
}
