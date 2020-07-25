/*
 Example Input/Output 1:
 Input:
 4
 7735 90281 273117 45705
 Output:
 7735 90281 45705
 Explanation:
 In the integer 7735, the concatenation of the first two digits is 77 and the concatenation of the last two digits is 35. Here both 77 and 35 are divisible by 7. So 7735 is printed. In the integer 90281, the concatenation of the first two digits is 90 and the concatenation of the last two digits is 81. Here both 90 and 81 are divisible by 3 or 9. So 90281 is printed. In the integer 273117, the concatenation of the first two digits is 27 and the concatenation of the last two digits is 17. Here both 27 and 17 are not divisible by any integer other than 1. So 273117 is NOT printed. In the integer 45705, the concatenation of the first two digits is 45 and the concatenation of the last two digits is 5. Here both 45 and 5 are divisible by 5. So 45705 is printed.
 Example Input/Output 2:
 Input:
 7
 5671 62743 3323 45832 6685 2479 5917
 Output:
 -1
 Example Input/Output 3:
 Input:
 3
 5313 9922 12300
 Output:
 9922 12300
 */
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int printed=0;
		for(int i=0;i<n;i++)
		{
		    String s=in.next();
		    int l=s.length();
		    String first=s.substring(0,2);
		    String last=s.substring(l-2,l);
		    for(int j=2;j<=99;j++)
		    {
		        if(Integer.parseInt(first)%j==0 && Integer.parseInt(last)%j==0)
		        {
		            System.out.print(s+" ");
		            printed++;
		            break;
		        }
		    }
		}
        if(printed==0)
        {
            System.out.print("-1");
        }
	}
}
