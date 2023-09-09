import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            int A,B;
        A=sc.nextInt();
        B=sc.nextInt();
        int c=A+B;
        int cnt=0;
        if(c>1)
        {
            for(int i=1;i<=c;i++)
            {
                if(c%i==0)
                cnt++;
            }
        }
        int s=0;
        if(cnt==2)
        {
            s=1;
        }
        if(s==1)
        {
            System.out.println("tevitt");
        }
        else
        {
            System.out.println("Satya");
        }}
    }
}