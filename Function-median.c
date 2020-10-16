float median(int *arr, int len)
{
    int start_index = 0, end_index = len - 1, median_order;
    float res;
    if(len % 2 !=0)
    {
        median_order = (len + 1) / 2.0;
        res = quick_select(arr, start_index, end_index, median_order);
    }
    else
    {
        median_order=len/2;
        float res1=quick_select(arr,start_index,end_index,median_order);
        float res2=quick_select(arr,start_index,end_index,median_order+1);
        res=(res1+res2)/2.0;

    }
    return res;
}
