import java.util.Scanner;
public class p1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);//i,j,(char)(64+i)//j
            }
            System.out.println();
        }
    }
}