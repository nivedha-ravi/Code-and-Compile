/*
The program must accept an integer matrix of size NxN as the input.
The program must print the matrix if the matrix is left diagonally dominant. Else the program must print No as the output.
A diagonal is said to be dominant if elements in the diagonal are greater than or equal to the sum of all other elements in their row.
Note: Consider the absolute value for calculating the sum.
Boundary Condition(s):
3 <= N <= 50
Input Format:
The first line contains the value of N. The next N lines contain N integers separated by space(s).
Output Format:
The first line contains either 'No' or the N lines contain the matrix if diagonally dominant.
Example Input/Output 1:
Input:
3
3 -2 1
1 -3 -1
2 3 7
Output:
3 -2 1
1 -3 -1
2 3 7
Explanation:
The diagonal element in the first row is 3. |3| >= |-2| + |1| = |3| = |3|
The diagonal element in the second row is 3 (|-3| = 3). |-3| >= |1| + |-1| = |-3| > |2|
The diagonal element in the third row is 7. |7| >= |2| + |3| = |7| > |5|
Here, all the three left diagonal elements are greater than or equal to the sum of other two elements in their row.
So, it is diagonally dominant. Hence the matrix is printed
Input:
4
4 -1 -1 -1
2 -6 2 3
1 2 4 1
2 3 1 -5
Output:
No
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n][n];
for(int i=0;i<n;i++)
{
    int sum=0;
    for(int j=0;j<n;j++)
    {
        scanf("%d ",&a[i][j]);
        if(i!=j)
        {
            sum+=a[i][j];
        }
    }
    if(abs(a[i][i])<sum)
    {
        printf("No");
        return 0;
    }
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        printf("%d ",a[i][j]);
    }
    printf("\n");
}


}
