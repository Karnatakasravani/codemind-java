import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-2;j++)
            {
                System.out.print(j);
            }
            for(k=n-3;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.print("
");
        }
    }
}