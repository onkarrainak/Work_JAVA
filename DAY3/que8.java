// 10.	Java Program to Make a Simple Calculator Using switch...case

import java.util.Scanner;

public class que8 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        

        int i = 75;
        int j = 25;

        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");

        switch (num) {
            case 1:
                int add = i+j;
                System.out.println("The Addition is " + add);
                break;
            case 2:
                int sub = i-j;
                System.out.println("The Subtraction is " + sub);  
                break;
            case 3:
                int mul = i*j;
                System.out.println("The Multiplication is " + mul); 
                break;
            case 4:
                int div = i/j;
                System.out.println("The Division is " + div);
                break;
        
            default:
                System.out.println("Enter number between 1 to 4");
                break;
        }
    }
}
