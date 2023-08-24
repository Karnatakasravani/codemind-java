import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j==i||j==(n+1)-i)
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.print("
");
        }
    }
}