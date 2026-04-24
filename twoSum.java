/*
Description:
Finds consecutive pair elements whose sum is equal to the given target value and prints their positions in the array.

Approach:

Take array size and elements as input.
Read the target sum value.
Traverse the array and check each adjacent pair.
Calculate the sum of current element and next element.
If the pair sum matches the target, print their positions.
Continue until all adjacent pairs are checked.

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


*/


import java.util.*;

public class twoSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter targer sum:");
        int k=sc.nextInt();

        for(int i=0;i<n-1;i++){
            int subSum=0;
            subSum=arr[i]+arr[i+1];
            if(subSum==k)
                System.out.print((i+1)+" "+(i+2));
        }

    }
}
