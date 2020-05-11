/*
Input:
10
2
20
5
Output:
15.0
3.5
*/
#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int x1,y1,x2,y2;
cin>>x1>>y1>>x2>>y2;
printf("%.1f",float(x1+x2)/2.0);
cout<<endl;
printf("%.1f",float(y1+y2)/2.0);

}
