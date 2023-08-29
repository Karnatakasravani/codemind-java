import java.util.Scanner;
public class SquareNumber
{
    static boolean sumSquare(int n)
    {
        for(long i=0;i<=n;i++)
           for(long j=0;j<=n;j++)
                if(i*i+j*j==n)
                {
                    return true;
                }
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(sumSquare(n))
            System.out.println("True");
        else
            System.out.println("False");
        
    }
}