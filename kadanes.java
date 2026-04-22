/*
Approach:

Take array size and elements as input.
Traverse the array while maintaining a running sum.
If the running sum becomes negative, reset it to zero.
Update maximum sum whenever a larger sum is found.
Track the start and end indices of the maximum subarray.
Print the subarray length, maximum sum, and elements.

*/

import java.util.*;

public class kadanes {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int maxSum=Integer.MIN_VALUE;
        int asStart=-1;
        int asEnd=-1;
        int start=0;
        int maxLen=0;
        int sum=0;


        for(int i=0;i<n;i++)
        {
            if(sum==0)
                start=i;

            sum=sum+arr[i];

            if(sum>maxSum)
            {
                asStart=start;
                asEnd=i;
                maxSum=sum;
            }

            if(sum<0)
                sum=0;
        }

        maxLen=asEnd-asStart+1;

        System.out.println("No.of elements in SubArray : "+maxLen);
        System.out.println("Max sum of the SubArray : "+ maxSum);

        for(int i=asStart;i<=asEnd;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
