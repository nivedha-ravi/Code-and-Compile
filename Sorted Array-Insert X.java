The program must implement the function insertInSortedPosition to accept an array arr (containing N values sorted in ascending order) and an integer value X.
The program must return an array with N+1 values with the value X inserted in the arr (so that the N+1 values remain sorted).
Note:
In C language, you must use malloc to initiate the array to be returned.
Example Input/Output 1:
Input:
5
10 20 30 40 50
35
Output:
10 20 30 35 40 50
Explanation:
Here N is 5 and X=35. So 35 must be inserted between 30 and 40.
*/
//N is the size of the Array arr
int[] insertInSortedPosition(int arr[], int N, int X) {
int arr1[]=new int[N+1];
int i=0;
int p=N+1;
for(i=0;i<N;i++)
{
    if(X<arr[i])
    {
        p=i+1;
        break;
    }
}
for(i=0;i<N+1;i++)
{
    if(i<p-1)
    {
        arr1[i]=arr[i];
    }
    else if(i==p-1)
    {
        arr1[i]=X;
    }
    else
    {
        arr1[i]=arr[i-1];
    }
}
return arr1;
}
