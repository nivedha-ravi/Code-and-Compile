int* getInputMatrix(int R,int C)
{
    int *a=(int*)malloc(R*C*(sizeof(int)));
    for(int i=0;i<R*C;i++)
    {
       scanf("%d ",&a[i]);
    }
    return a;
}
