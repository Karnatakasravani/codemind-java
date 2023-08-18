import java.util.Scanner;
public class Share{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        int val=x+2*y;
        if(val%2==0)
        {
            if(x==0&&y%2!=0)
            System.out.print("NO");
            else
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}