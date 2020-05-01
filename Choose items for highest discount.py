"""
Chandru went for shopping and he was offered N number of items at various discount percentage rates.
Out of these N items he wants to choose N-1 items such that the amount he saves is maximum.
The program must print the item which is to be left out.Input Format:First line will contain the value of N - number of
itemsN lines containing item name, label price and the discount percentage separated by one or more spaces.
Output Format:The name of the item which is not to be purchased as it offers least discount.
Boundary Conditions:2 <= N <= 20
The length of the item name string value is from 1 to 100.
The price of the item is from 1 to 999999
Example Input/Output 1:Input:
3
harddisk 4000 20
monitor 15000 10
laptop 30000 5
Output:harddisk
Explanation:harddisk savings = 800, monitor savings = 1500, laptop savings = 1500.
Hence harddisk is offering least savings and is to be left out.
"""
a=int(input())
g,l=[],[]
for i in range(a):
    b,c,d=map(str,input().split())
    c,d=int(c),int(d)
    dis=(d/100)*c
    l.append(dis)
    g.append(b)
h=min(l)
print(g[l.index(h)])
