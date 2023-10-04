/* Find sum of numbers(int) using a suitable ADT (Abstract DataType)*/

#include <stdio.h>

int main() {
    int arr[] = {1,2,3,4,5};
    int sum=0;
    int array_length = sizeof(arr)/sizeof(arr[0]);

    for(int i=0;i<array_length;i++) {
        sum+=arr[i];
    }

    printf("Sum of all elements of array is %d\n",sum);
}