import java.util.Scanner;
public class Monopoly 
{
    public static void main(String[] args) 
    {
        
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a==b && b==c && c==a)
        {
            System.out.println("NO");
        }
        else if((a+b)<c)
        {
            System.out.println("YES");
        }
        else if(a>(b+c))
        {
            System.out.println("YES");
        }
        else if((a+c)<b)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        }
    }
}