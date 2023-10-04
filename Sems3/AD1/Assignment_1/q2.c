/* Find Max and Min from a given array of Integers */

#include <stdio.h>

int main() {
    int arr[] = {25,234,123,124,256,342,3341,2312,23,4563,456345};
    int array_length = sizeof(arr)/sizeof(arr[0]);
    int min=arr[0],max=arr[0];
    for(int i=0;i<array_length;i++) {
        if(min>arr[i]) {
            min = arr[i];
        }

        if(max<arr[i]) {
            max = arr[i];
        }
    }

    printf("Min Max is %d and %d respectively.\n",min,max);
}