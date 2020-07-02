/*
Input:
5
24 987 1 9870 15
Output:
27 981 0 9875 14
Explanation: Here N = 5. After shifting the unit digits of the 5 integers to the left by one position, the integers become 27 981 0 9875 14.
Hence the output is 27 981 0 9875 14
*/
private static void leftShiftUnitDigits(int arr[], int N) {
    int temp=arr[0]%10;
    for(int i=0;i<N;i++)
    {

        if(i==N-1)
        {
            arr[i]=(arr[i]/10*10)+(temp);
        }
        else
        {
            arr[i]=(arr[i]/10*10)+(arr[i+1]%10);
        }
    }

}
