import java.util.Scanner;
public class ColorCode{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch == 'V' || ch =='v')
        {
            System.out.printf("Violet");
        }
        else if(ch =='I' ||  ch == 'i')
        {
            System.out.printf("Indigo");
        }
        else if(ch =='B'||ch =='b')
        {
            System.out.printf("Blue");
        }
        else if(ch == 'G' || ch == 'g' )
        {
            System.out.printf("Green");
        }
        else if(ch =='Y'||ch =='y')
        {
            System.out.printf("Yellow");
        }
        else if(ch =='O'||ch =='o')
        {
            System.out.printf("Orange");
        }
        else if(ch == 'R' || ch == 'r')
        {
            System.out.printf("Red");
        }
        else
        {
            System.out.println(-1);
        }
    }
}