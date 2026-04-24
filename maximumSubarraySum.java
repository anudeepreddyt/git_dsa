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