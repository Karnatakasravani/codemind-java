import java.util.Scanner;
public class A
{
        public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            if(i%x==0 && i%y!=0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
        
}