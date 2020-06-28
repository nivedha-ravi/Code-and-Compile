void swapFirstAndLastColumn(int R,int C,int matrix[][C])
{
    for(int i=0;i<R;i++)
    {
        int temp=matrix[i][0];
        matrix[i][0]=matrix[i][C-1];
        matrix[i][C-1]=temp;

    }
}
