/* Find factorial of given number n. Take n as input from user. */

#include<stdio.h>
#include<stdlib.h>

int main() {
    int n;
    printf("Enter the value of n: ");
    scanf("%d",&n);
    int fact = 1;
    for(int i=1;i<=n;i++) {
        fact *= i;
    }
    printf("Factorial of %d is %d\n",n,fact);
    return 0;
}