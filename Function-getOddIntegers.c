/*
You are required to complete the given code. You can click on Run anytime to check the compilation/execution status of the program. You can use printf to debug your code. The submitted code should be logically/syntactically correct and pass all test cases. Do not write the main() function as it is not required. Code Approach: For this question, you will need to complete the code as in the given implementation. We do not expect you to modify the approach. The function/method getOddIntegers accepts two arguments - size and arr, an integer representing the size of the array and the array arr. The function/method getOddIntegers must return an array of integers containing the odd integers in the given array arr. If there is no odd integer in the array arr, then the function must return an array of size 1 with the value -1. Your task is to implement the function getOddIntegers so that it passes all the test cases. The following structure is used to represent the boundedArray and is already defined in the default code (Do not write this definition again in your code).
typedef struct BoundedArray
{
int SIZE;
int *arr;
} boundedArray;
*/
boundedArray* getOddIntegers(int SIZE, int arr[])
{
    boundedArray *ptr=(boundedArray*)malloc(sizeof(boundedArray));
    int oddCount=0;
    for(int i=0;i<SIZE;i++)
    {
        if(arr[i]&1)
        {
            arr[oddCount++]=arr[i];
        }
    }
    ptr->SIZE=oddCount;
    ptr->arr=arr;
    if(oddCount==0)
    {
        ptr->SIZE=1;
        ptr->arr[0]=-1;
    }
    return ptr;

}
