"""
INPUT:
100000 80000
100 80
OUTPUT:
0.00
"""


area=input().split(" ")
alenarea=int(area[0])/5
timaerea=int(area[1])/5
court=input().split(" ")
alenlen=alenarea/int(court[0])
timlen=timaerea/int(court[1])
cost=abs(alenlen-timlen)
cost="{:.2f}".format(cost)
print(cost)
