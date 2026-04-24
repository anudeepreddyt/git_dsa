/*
Description:
Finds all unique triplets in the array whose sum is equal to the given target value and prints the matching triplets.

Approach:

Take array size and elements as input.
Read the target sum value.
Use three nested loops to generate all possible triplets.
Check if the sum of three elements equals the target.
Store matching triplets in a set to avoid duplicates.
Sort each triplet before storing for uniqueness.
Print all unique triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
*/



import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        Set<List<Integer>> set=new HashSet<>();

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the target:");
        int k=sc.nextInt();
        for(int i=0;i<n-2;i++){
            for(int j=i;j<n-1;j++){
                for(int m=j;m<n;m++){
                    if((arr[i]+arr[j]+arr[m])==k)
                    {
                        List<Integer> list=new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[m]);
                        
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }

        System.out.print(set);
    }
}
