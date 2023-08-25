import java.util.Scanner;
public class StrictlyOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0 && arr[i]%2==0)
            {
                c++;
            }
        }
        int c2=0;    
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                c2++;
            }
        }
        if(c==c2)
        {
            System.out.println("True");
        }
        else{
            System.out.printf("False");
        }
    }
}