import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0,s=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            
        }
        int avg=sum/n;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=avg)
            {
                s++;
            }
        }
        System.out.println(s);
    }
}