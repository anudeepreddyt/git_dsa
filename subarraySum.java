import java.util.*;

public class subarraySum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        System.out.print("Enter sub Array sum:");
        int k=sc.nextInt();
        int count=0;

        for(int i=0;i<n;i++){
            int subSum=0;

            for(int j=i;j<n;j++){
                subSum=subSum+arr[j];

                if(subSum==k)
                    count++;
            }
        }
        
        System.out.print(count);
        
    }
}