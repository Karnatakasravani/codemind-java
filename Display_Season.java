import java.util.Scanner;
public class A{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N==4||N==5||N==6)
        System.out.print("Summer");
        else if(N==7||N==8||N==9||N==10)
        System.out.print("Rainy");
        else if(N==11||N==12||N==1)
        System.out.print("Winter");
        else if(N==2||N==3)
        System.out.print("Spring");
        else 
        System.out.print("-1");
    }
}