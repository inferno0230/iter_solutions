/* Find whether a given array contains two consicutive integers with same value, If yes, print yes, if not, print no
   If yes, find two more integers in the array and thier indices such that thier sum is equal to the sum of those consicutive integers.
   If not, print no. 
*/

#include <stdio.h>
#include <stdbool.h>

int main() {
    int arr[] = {9,12,12,4,23,53,15};
    bool exists = false;
    int indice,sum;
    int array_length = sizeof(arr) / sizeof(arr[0]);
    // Check if consecutive integers with same values exists
    for(int i=0;i<array_length;i++) {
        if(arr[i]==arr[i-1]){
            exists = true;
            indice = i;
            sum = arr[i]+arr[i-1];
        }
    }

    if(exists) {
        printf("Yes\n");
        for(int i=0;i<array_length;i++) {
            for(int j=0;j<array_length;j++) {
                if(arr[i]+arr[j] == sum && arr[i] != arr[indice]) {
                    printf("Num_1 is %d and Num_2 is %d\n",arr[i],arr[j]);
                }
            }
        }
    } else {
        printf("No\n");
    }

    return 0;
}