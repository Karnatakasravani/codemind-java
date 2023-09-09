import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double sum=0;
        for(int i=a;i<=b;i++)
        {
            sum+=Math.sqrt(i);
        }
        System.out.printf("%.2f",sum);
    }
}