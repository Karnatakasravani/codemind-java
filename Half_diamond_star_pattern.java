import java.util.*;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        if(n>=3 && n<=100)
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                System.out.print("*");
                System.out.print("
");
            }
            for(i=1;i<=n-1;i++)
            {
                for(j=i;j<=n-1;j++)
                System.out.print("*");
                System.out.print("
");
            }
        }
        else
        {
            System.out.print("The pattern is not possible");
        }
    }
}