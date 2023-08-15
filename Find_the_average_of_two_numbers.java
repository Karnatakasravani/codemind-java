import java.util.Scanner;
public class Avg
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float avg=(float)(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}