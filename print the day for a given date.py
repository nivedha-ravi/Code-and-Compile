"""
INPUT:
MON[first day of the month]
10
OUTPUT:
WED
"""
day1=input().strip()
date1=int(input())
days=["MON","TUE","WED","THU","FRI","SAT","SUN"]
if day1 in days:
    f=date1+days.index(day1)
if f%7==0:
    print("SUN")
elif f%7==1:
    print("MON")
elif f%7==2:
    print("TUE")
elif f%7==3:
    print("WED")
elif f%7==4:
    print("THU")
elif f%7==5:
    print("FRI")
elif f%7==6:
    print("SAT")
