import java.util.Scanner;
public class a{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if(a<=(b/2))
            {
                System.out.println("YES");
            }
            else if(b%a==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t-=1;
        }   
    }
}