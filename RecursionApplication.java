
package recursionapplication;

import java.util.Scanner;

public class RecursionApplication {
    public static  int fibonacci(int pos)
    {
        if(pos==0 || pos==1)
        {
            return 1;
        }
        else
        {
        return fibonacci(pos-1)+fibonacci(pos-2);
    }
}
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Digit to find the Fibonacci :");
        int input=sc.nextInt();
        int start=0;
        for (int i=0; i<input; i++)
        {
            start=fibonacci(i);
            System.out.println(start);
        }
        
        
        
    }
    
}
