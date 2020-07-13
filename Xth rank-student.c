/*Example Input/Output 1:
Input: 6 2
peter 70
dave 86
divya 70
deepika 68
kevin 22
sherlock 68
Output:
divya
peter
Explanation:
The name and the rank of all the students are given below.
peter: Rank 2
dave: Rank 1
divya: Rank 2
deepika: Rank 4
kevin: Rank 6
sherlock: Rank 4
There are two students who got the rank 2, so their names are printed in ascending order.
Example Input/Output 2:
Input: 4 3
Shgirm 20
Mhgcx 88
Kviq 88
Hasdyg 88
Output: -1
Explanation:
The name and the rank of all the students are given below.
Shgirm: Rank 4
Mhgcx: Rank 1
Kviq: Rank 1
Hasdyg: Rank 1
No one got the rank 3, so -1 is printed.
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,k;
    scanf("%d %d\n",&n,&k);
    char s[n][100];
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%s %d\n",s[i],&a[i]);
    }
    char t1[100][100];
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]<a[j]){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                strcpy(t1,s[i]);
                strcpy(s[i],s[j]);
                strcpy(s[j],t1);
            }
        }
    }
    int r[n];
    int i,j;
    for(i=0,j=1;i<n-1;i++){
        while(a[i]==a[i+1]){
            r[i++]=j;
        }
        r[i]=j;
        j=i+1;
        j++;
    }
    r[i]=j;
    char b[n][100];
    int u=0;
    for(i=0;i<n;i++){
        if(r[i]==k){
            strcpy(b[u++],s[i]);
        }
    }
    char o[100][100];
    for(i=0;i<u;i++){
        for(j=i+1;j<u;j++){
            if(strcmp(b[i],b[j])>0){
                strcpy(o,b[i]);
                strcpy(b[i],b[j]);
                strcpy(b[j],o);
            }
        }
    }
    int p=0;
    for(i=0;i<u;i++){
        printf("%s\n",b[i]);
        p=1;
    }
    if(p==0){
        printf("-1");
    }
}
