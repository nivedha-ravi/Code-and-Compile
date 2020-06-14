/*
Example Input/Output 1:
Input:
3 3
cat maths cow
pillow day four
dairy milk monsoon
Output:
|cat***|maths|cow****|
|pillow|day**|four***|
|dairy*|milk*|monsoon|
Explanation:
In the given 3x3 word matrix, the longest word in each column are highlighted below. cat maths cow pillow day four dairy milk monsoon In the first column, pillow is the longest word and it's length is 6. The length of cat is 3 and dairy is 5. Hence the number of asterisks to be appended to cat is the difference between pillow length and cat length which is 6-3 = 3. The number of asterisks to be appended to dairy is the difference between pillow length and dairy length which is 6-5 = 1. Similarly, in the second column, the longest word is maths whose length is 5. The number of asterisks to be appended to day is 5-3 = 2 (5 is the length of maths and 3 is the length of day). For milk it is 5-4 = 1. Similarly, in the third column, the longest word is monsoon whose length is 7. The number of asterisks to be appended to cow is 7-3 = 4 (7 is the length of monsoon and 3 is the length of cow). For four it is 7-4=3.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		String[][] str=new String[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        str[i][j]=in.next();
		    }
		}
		int max=0;
		int a[]=new int[50];
        for(int j=0;j<c;j++)
        {
            for(int i=0;i<r;i++)
            {
                if(str[i][j].length()>max)
                {
                    max=str[i][j].length();
                }
            }
            a[j]=max;
            max=0;
        }
        for(int i=0;i<r;i++)
        {

            for(int j=0;j<c;j++)
            {
                System.out.print("|"+str[i][j]);
                if(str[i][j].length()!=a[j])
                {
                    int m=a[j]-str[i][j].length();
                    for(int k=0;k<m;k++)
                    {
                        System.out.print("*");
                    }
                }

            }
            System.out.print("|");
            System.out.println();
        }
	}
}
