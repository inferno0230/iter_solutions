/* Rotate a given array by K positions. Take value of K as input from user. */

#include<stdio.h>
#include<stdlib.h>

int main() {
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int array_length = sizeof(arr) / sizeof(arr[0]);
    int k;
    printf("Enter the value of K: ");
    scanf("%d",&k);
    int temp[array_length];
    for(int i=0;i<array_length;i++) {
        temp[(i+k)%array_length] = arr[i];
    }
    for(int i=0;i<array_length;i++) {
        printf("%d ",temp[i]);
    }
    printf("\n");
    return 0;
}