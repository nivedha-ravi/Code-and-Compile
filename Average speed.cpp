#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
    int d,t,tt=0,dd=0;
    char ch;
    while(cin>>d>>ch>>t)
    {
        tt+=t;
        dd+=d;
    }
    printf("%.2f kmph",dd/(float)tt);


}
