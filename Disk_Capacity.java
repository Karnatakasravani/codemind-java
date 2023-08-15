import java.util.Scanner;
public class Capacity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t,r,s;
        t=sc.nextInt();
        r=sc.nextInt();
        s=sc.nextInt();
        int c=2*t*r*s*512;
        System.out.print(c);
    }
}