import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c1=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                c1+=arr[i];
            }
        }
        int c2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                c2+=arr[i];
            }
        }
        if(c1>c2)
        {
             System.out.println(c1-c2);
        }
        else
        {
            System.out.println(c2-c1);
        }
    }
}