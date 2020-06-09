/*
The program must accept an integer N as the input.The program must print all the step numbers from 1 to N as the output.If there is no such integer then the program must print -1 as the output.A number is called a step number if all the adjacent digits have an absolute difference of 1.
INPUT:
12
output:
10 12
INPUT:
130
OUTPUT:
10 12 21 23 32 34 43 45 54 56 65 67 76 78 87 89 98 101 121 123
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<10)
        {
            System.out.print("-1");
        }
        else{
            for(int i=10;i<=n;i++)
            {
                int temp=i;
                int count=0,c=1;
                while(temp>10)
                {
                    int unit=temp%10;
                    int tenth=(temp/10)%10;
                    c++;
                    if(Math.abs(unit-tenth)==1)
                    {
                        count++;
                    }
                    temp/=10;
                }
                if(c-1==count)
                {
                    System.out.print(i+" ");
                }
            }
        }

	}
}
