/* Find N-th fibonacci number. Take value of n as input from user. */

#include<stdio.h>
#include<stdlib.h>

int main() {
    int n;
    printf("Enter the value of n: ");
    scanf("%d",&n);
    int a = 0;
    int b = 1;
    int c;
    for(int i=0;i<n;i++) {
        c = a+b;
        a = b;
        b = c;
    }
    printf("The %dth fibonacci number is %d\n",n,c);
    return 0;
}