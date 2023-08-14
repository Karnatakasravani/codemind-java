import java.util.Scanner;
public class temp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        double f=1.8*(c)+32;
        System.out.print(String.format("%.2f", f));
    }
}