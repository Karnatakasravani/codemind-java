import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String c=A+B;
        /* Enter your code here. Print output to STDOUT. */
        int sumLength = A.length() + B.length();
    System.out.println(sumLength);

    int lexico = A.compareTo(B);
    if (lexico < 0) {
        System.out.println("No");
    } else {
        System.out.println("Yes");
    }

    A = A.replace(A.charAt(0), A.toUpperCase().charAt(0));
    B = B.replace(B.charAt(0), B.toUpperCase().charAt(0));
    System.out.println(A + " " + B);

    }
}



