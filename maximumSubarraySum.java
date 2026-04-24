/*
Description:
Finds the maximum sum of any contiguous subarray with a fixed size k and prints the highest sum.

Approach:

Take array size and elements as input.
Read the required subarray size k.
Traverse the array and generate all possible subarrays of size k.
Calculate the sum of each subarray.
Compare each sum with the current maximum sum.
Print the maximum subarray sum.
*/


import java.util.*;

public class maximumSubarraySum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxSum=0;
        System.out.print("Enter subarray size:");
        int k=sc.nextInt();

        for(int i=0;i<=n-k;i++){
            int subSum=0;

            for(int j=0;j<k;j++){
                subSum=subSum+arr[i+j];
            }

            maxSum=Math.max(subSum,maxSum);

        }
        System.out.print(maxSum);
    }
}
