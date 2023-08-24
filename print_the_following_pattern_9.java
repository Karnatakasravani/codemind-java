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
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(i*2)-1;k++)
            {
                System.out.print(i);
            }
            System.out.print("
");
        }
    }
}