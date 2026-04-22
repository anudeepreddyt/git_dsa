/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

Approach:

Take array size and elements as input.
Traverse the array from beginning to end.
Whenever a zero is found, shift all next elements one position to the left.
Place zero at the end of the array.
Print the final updated array.

*/


import java.util.*;

public class moveZeroes{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++) 
        {
            if(arr[i]==0)
            {
                int temp=0;
                arr[i]=temp;

                for(int j=i;j<n-1;j++)
                {
                    arr[j]=arr[j+1];
                }

                arr[n-1]=temp;

            }
        }

        System.out.print(Arrays.toString(arr));
    }
}
