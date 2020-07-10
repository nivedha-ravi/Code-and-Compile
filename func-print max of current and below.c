/*
Input:
4 3
23 48 15
22 50 33
49 26 16
18 47 11
Output:
23 50 33
49 50 33
49 47 16
18 47 11
*/
int (*ptr)[C]=matrix;
for(int i=0;i<R;i++)
{
    for(int j=0;j<C;j++)
    {
        if(i!=r-1)
        {
            printf("%d ",(ptr[i][j]>ptr[i+1][j])?ptr[i][j]:ptr[i+1][j]);
        }
        else
        {
            printf("%d ",ptr[i][j]);
        }
    }
    printf("\n");
}
