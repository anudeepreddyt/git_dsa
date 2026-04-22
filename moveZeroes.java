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