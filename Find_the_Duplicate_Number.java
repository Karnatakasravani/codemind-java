import java.util.Scanner;
public class DuplicateElement {  
    public static void main(String[] args) {      
        Scanner sc=new Scanner(System.in);
        //Initialize array   
        int n=sc.nextInt();
        int [] arr = new int [n] ; 
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
          
        //System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  