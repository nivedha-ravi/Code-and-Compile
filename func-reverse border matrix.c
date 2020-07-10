/*
Input:
3 4
48 15 47 21
24 14 30 50
25 31 23 43
Output:
21 47 15 48
50 14 30 24
43 23 31 25
Explanation: The first and the last row of the matrix are reversed and then the first and last column of the matrix are swapped.
21 47 15 48 50 14 30 24 43 23 31 25
*/
void reverseRow(int C,int *row)
{
    int left=0,right=C-1;
    while(left<right)
    {
        int temp=row[left];
        row[left]=row[right];
        row[right]=temp;
        left++;
        right--;
    }
}
void reverseBorder(int R, int C, int *matrix)
{
    int (*ptr)[C]=matrix;
    reverseRow(C,ptr[0]);
    reverseRow(C,ptr[R-1]);
    for(int i=1;i<=R-2;i++)
    {
        int temp=ptr[i][0];
        ptr[i][0]=ptr[i][C-1];
        ptr[i][C-1]=temp;
    }
}
