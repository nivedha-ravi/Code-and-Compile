void writeOddEvenToFiles(int N, int arr[])
{
    FILE *fodd=fopen("odd.txt","w+");
    FILE *feven=fopen("even.txt","w+");
    for(int i=0;i<N;i++)
    {
        if(arr[i]%2==0)
        {
            fprintf(feven,"%d ",arr[i]);
        }
        else
        {
            fprintf(fodd,"%d ",arr[i]);
        }
    }
    fclose(fodd);
    fclose(feven);

}
