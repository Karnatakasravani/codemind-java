import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int p=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i*i==n)
            {
                p=1;
            }
            
        }
        if(p==1){
        System.out.printf("True");
        }
        else
        {
            System.out.printf("False");
        }
        
        
    }
}
