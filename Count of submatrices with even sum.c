/*
You must implement the function getCountOfSubMatricesWithEvenSum which accepts two integers (R and C) and an integer matrix of size RxC as the input.
The function must return the count of submatrices of size 2x2 having the sum as even.
Example Input/Output 1:
Input:
3 4
2 5 1 8
1 4 7 3
6 1 8 2
Output:
4
Explanation:
There are 4 submatrices of size 2x2 having the sum as even.
They are given below.
Submatrix 1:
2 5
1 4
Submatrix 2:
1 4
6 1
Submatrix 3:
4 7
1 8
Submatrix 4:
7 3
8 2
*/
int getCountOfSubMatricesWithEvenSum(int R,int C,int matrix[][C])
{
    int count=0;
    for(int i=0;i<=R-2;i++)
    {
        for(int j=0;j<=C-2;j++)
        {
            if((matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i+1][j+1])%2==0)
            {
                count++;
            }
        }
    }
    return count;
}
