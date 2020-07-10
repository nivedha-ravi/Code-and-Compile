void writeMatrixToFile(int R, int C, int matrix[][C])
{
    FILE *fp=fopen("output.txt","w");
    fprintf(fp,"%d %d\n",R,C);
    for(int i=0;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            fprintf(fp,"%d ",matrix[i][j]);
        }
        fprintf(fp,"\n");
    }
    fclose(fp);
}
