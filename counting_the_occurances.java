import java.util.*;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        int cnt=0,s=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                
                    cnt++;
                
        }
        if(cnt>=1)
        {
            System.out.println(cnt);
        }
        else 
        {
          System.out.println("-1");
        }
    }
}