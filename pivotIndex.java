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