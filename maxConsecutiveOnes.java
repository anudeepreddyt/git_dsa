/*
Description:
Finds the maximum number of consecutive 1s present in the array and prints the longest streak.

Approach:

Take array size and elements as input.
Traverse the array element by element.
If the current element is 1, increase the count.
Update the maximum count whenever a longer streak is found.
If the current element is not 1, reset the count to zero.
Print the maximum consecutive count.

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

*/


import java.util.*;

public class maxConsecutiveOnes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int maxCount=0;
        int count=0;
        for(int num:arr)
        {

            if(num==1)
            {
                count++;
                maxCount=Math.max(maxCount,count);
            }
            else
                count=0;
        }
        System.out.print(maxCount);
    }
}

