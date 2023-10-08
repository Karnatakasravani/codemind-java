import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder p=new StringBuilder(A);
        p.reverse();
        String s=p.toString();
        if (s.compareTo(A)==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}



