import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int r,sum=0,temp;
            temp=n;
            while(n>0)
            {
                r=n%10;  //getting remainder  
                sum=(sum*10)+r;    
                n=n/10;    
            }    
            if(temp==sum)    
            System.out.println("True");    
            else    
            System.out.println("False");   
        }
    }
}
