import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') 
            {
                System.out.print(count+" ");
                count = 0;
            } 
            else
            {
                count++;
            }
        }
        System.out.print(count+" ");
        }
}