import java.util.Scanner;
public class Sample1{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int number1,number2,number3;
    number1=sc.nextInt();
    number2=sc.nextInt();
    number3=number1+number2;
   // System.out.println("Sum of "+ number1 + " and " + number2 + " is " + number3);
    System.out.printf( "%d",number3);
    }
}
