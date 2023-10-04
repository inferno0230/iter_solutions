/* Find the smallest positive integer from a given array of positive and negative integer. */

#include <stdio.h>
#include <stdlib.h>

int main() {
    int arr[] = {9,5,8,2,5,-1,-8,-2,-5,9,-9};
    int array_length = sizeof(arr)/sizeof(arr[0]);
    int x=arr[0];
    for(int i=0;i<array_length;i++) {
        if(arr[i]<x && arr[i]>0) {
            x=arr[i];
        }
    }
    printf("%d\n",x);
}