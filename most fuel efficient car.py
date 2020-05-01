"""
Given fuel consumed and the distance covered for a certain number of cars,
find the most fuel efficient car.
Input Format:First line will contain the number N representing the number of cars.
Next N lines will contain the fuel consumed in liters and the distance run in kilometers (both separated by a space).
Output Format:The number of the car which is most fuel efficient.
Sample Input/Output:
Example 1:Input:310 30020 55015 460
Output:3
Explanation:Average mileage of car 1 = 300/10 = 30 km/liter, car 2 = 550/20 = 27.5 km/liter,
car 3 = 460/15 = 30.67 km/literHence car 3 is most fuel efficient and hence 3 is printed.
Example 2:Input:
5
10 200
20 400
10 210
20 430
15 250
Output:4
Explanation:Car 4 having 430/20 = 21.5 km/liter is the most efficient.
"""
n=int(input())
ctr=1
maxavg=0
for i in range(n):
    x,y=input().split(" ")
    x,y=int(x),int(y)
    avg=float(y/x)
    if avg>maxavg:
        maxavg=avg
        car=ctr
    ctr+=1
print(car)
