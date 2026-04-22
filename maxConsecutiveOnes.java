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

