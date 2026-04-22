/*
Description:
Counts the number of subarrays whose sum is equal to the given target value and prints the total count.

Approach:

Take array size and elements as input.
Read the target subarray sum value.
Traverse the array using two loops to generate all possible subarrays.
Calculate the sum of each subarray.
If the subarray sum matches the target value, increase the count.
Print the total number of matching subarrays.

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
*/


import java.util.*;

public class subarraySum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        System.out.print("Enter sub Array sum:");
        int k=sc.nextInt();
        int count=0;

        for(int i=0;i<n;i++){
            int subSum=0;

            for(int j=i;j<n;j++){
                subSum=subSum+arr[j];

                if(subSum==k)
                    count++;
            }
        }
        
        System.out.print(count);
        
    }
}
