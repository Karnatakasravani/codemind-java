import java.util.Scanner;
class Cd8{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.print((x%y)+(x/y));
    }
}
