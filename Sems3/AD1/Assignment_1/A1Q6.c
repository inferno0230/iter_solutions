/* Find the largest sum contiguous subarray from an array */

#include <stdio.h>
#include <limits.h>

int main() {
   int arr[] = {1, 3, 8, -2, 6, -8, 5};
   int max_sum=INT_MIN, current_sum=0, array_length;
   array_length = sizeof(arr) / sizeof(arr[0]);

   for(int i=0;i<array_length;i++) {
      current_sum = 0; // Reset current_sum to 0 for each new subarray
      for(int j=i;j<array_length;j++) {
         current_sum+=arr[j];
         if(max_sum<current_sum) {
            max_sum = current_sum;
         }
      }
   }
   
   printf("Max sum is %d\n",max_sum);
   return 0;
}
