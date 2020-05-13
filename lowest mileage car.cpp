#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
char s[1000],bat[1000];
float f;
float min=1000;
while(scanf("%[^@]@%f ",s,&f)>0)
{
    if(f<min)
    {
        min=f;
        strcpy(bat,s);
    }
}
cout<<bat;

}
