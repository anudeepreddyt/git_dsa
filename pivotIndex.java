/*
Description:
Finds the pivot index of the array where the sum of elements on the left side is equal to the sum of elements on the right side. Prints the pivot index if found, otherwise prints -1.

Approach:

Take array size and elements as input.
Calculate the total sum of all elements in the array.
Traverse the array while maintaining the left sum.
For each index, calculate the right sum using total sum minus left sum and current element.
If left sum and right sum are equal, print the current index.
If no such index exists, print -1.

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
*/


import java.util.*;
 
public class pivotIndex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int totalSum=0;
        int leftSum=0;
        int rightSum=0;

        
        for(int num:arr)
            totalSum=totalSum+num;

        for(int i=0;i<n;i++){
            rightSum=totalSum-leftSum-arr[i];

            if(leftSum==rightSum)
            {
                System.out.print(i);
                return;
            }

            leftSum=leftSum+arr[i];
        }

        System.out.print(-1);


        
    }
}
