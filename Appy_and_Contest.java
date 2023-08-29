import java.util.Scanner;
public class AppyAndContest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n;
        n=sc.nextInt();
        for(int t=0;t<n;t++)
        {
            long N,A,B,K;
            N=sc.nextLong();
            A=sc.nextLong();
            B=sc.nextLong();
            K=sc.nextLong();
            long cnt=0;
            long i,m=0;
            for(i=1;i<=N;i++)
            {
                if(i%A==0 && i%B!=0)
                {
                    cnt++;
                }
                else if(i%A!=0 && i%B==0)
                {
                    cnt++;
                }
                
            if(cnt>=K)
            {
                System.out.println("Win");
                m=1;
                break;
                
            }
                
            }
            //int s=cnt-cn;
            
            if(m==0)
            {
                System.out.println("Lose");
            }
            
        }
        
    }
}