"""
Sharon does not like vowels.
So she wants to remove vowels from any string.
But her friend Jennie loves vowels and wants to retain vowels in as string.
So both discuss and agree to the following condition.-
They will reverse the string value and then remove the letters
in the positions of the vowels in the original string.
Help them by writing the program implementing the above condition.
Input Format:
First line will contain the string value S.Output Format:First line will contain the reversed string
value with the letters in the positions of vowels in the original string removed.Constraints:Length of String S is from 2 to 50.
Sample Input/Output:
Example 1:Input:
environment
Output:
nenrine
Explanation:
The reversed string value is tnemnorivne.
The vowels position in the original string are e-1 i-4 o-6 e-9Hence after removing the letters in the positions 1,4,6,9 the string is nenrineExample 2:Input:pondOutput:dopExplanation:The reversed string value is dnop.The vowels position in the original string are
o-2Hence after removing the letters in the positions 2 the string is dop
"""
l=list(input().strip())
a=[]
for i in range(len(l)):
    if l[i]=='a'or l[i]=='e' or l[i]=='i' or l[i]=='o' or l[i]=='u':
        a.append(i)
l=l[::-1]
for i in range(len(a)):
    l[a[i]]=""
for i in range(len(l)):
    print(l[i],end="")
