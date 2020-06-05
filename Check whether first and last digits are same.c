#include <stdio.h>
int main()
{
int N;
scanf("%d", &N);
int lastDigit = N % 10, firstDigit;
for(;N > 9; N /= 10);
  firstDigit = N;
if(firstDigit == lastDigit){
printf("YES");
}
else{
printf("NO");
} return 0;
}
