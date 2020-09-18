/*
Example Input/Output 1:
Input:
7 48 24 12 84 90 18 54
Output:
6
Explanation:
The given 7 integers are 48, 24, 12, 84, 90, 18 and 54. The HCF of the given 7 integers is 6. So 6 is printed as the output.
*/
int calculateGeneralHCF(int len, int arr[])
{
    int hcf=arr[0];
    for(int i=1;i<len;i++)
    {
        hcf=calculateHCF(arr[i],hcf);
    }
    return hcf;
}
