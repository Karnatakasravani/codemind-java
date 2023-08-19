import java.util.Scanner;
public class S {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=1;i<=n;i++)//rows loop
         {
            for(int j=1;j<=n;j++)
            {
                System.out.print((char)(64+i) + " ");//only i,j for printing numberws
            }
            System.out.println();
         }

    }
}