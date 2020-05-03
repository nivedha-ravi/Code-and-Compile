/*
The program must accept N integers and an integer X as the input.
The program must find the pair of integers that give X by performing addition or subtraction or multiplication.
Then the program must print the positions of the integers in all such pairs in sorted order as the output.
Note: At least any two integers in the array will give X by performing addition or subtraction or multiplication.
Boundary Condition(s): 2 <= N, X <= 100
Input Format:
The first line contains N and X separated by a space.
The second line contains N integers separated by a space.
Output Format:
The lines, each containing two integers separated by a space.
Example Input/Output 1:
Input:
7 10 2 7 14 3 17 5 4
Output: 1 6 2 4 2 5 3 7
Explanation:
 X = 10, The first and the sixth elements are 2 and 5.
 The multiplication of 2 and 5 gives (2*5) 10 which is equal to X. The position of 2 and 5 is 1 and 6. So, 1 6 are printed.
 The second and the fourth elements are 7 and 3. The addition of 7 and 3 gives (7+3) 10 which equal to X. The position of 7 and 3 is 2 and 4. So, 2 4 are printed. The second and the fifth elements are 7 and 17. The subtraction of 7 and 17 gives (17-7) 10 which is equal to X. The position of 7 and 17 is 2 and 5. So, 2 5 are printed. The third and the seventh elements are 14 and 4. The subtraction of 14 and 4 gives (14-4) 10 which is equal to X. The position of 14 and 4 is 3 and 7. So, 3 7 are printed.
 Example Input/Output 2:
 Input:
 4 15 5 2 4 3
 Output:
 1 4
 */
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,x;
scanf("%d %d\n",&n,&x);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if((a[i]+a[j]==x)||(abs(a[i]-a[j])==x)||(a[i]*a[j]==x))
        {
            printf("%d %d\n",i+1,j+1);
        }
    }
}

}
