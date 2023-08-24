import java.util.Scanner;
public class PrettyNumber{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int cnt=0;
            for(int i=a;i<=b;i++)
            {
                if(i%10==2)
                {
                    cnt++;
                }
                else if(i%10==3)
                {
                    cnt++;
                }
                else if(i%10==9)
                {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        
    }
}