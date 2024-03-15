// Write a program to find SUM of a given digit.
public class Que1 {

    public static void main(String args[]){
        int digit = 123;
        int b;
        int sum = 0;
        
        while (digit>0) 
        {
            b = digit % 10;
            sum = sum + b;
             digit = digit /10;        
        }
        System.out.println("The sum of given digit is " + sum);
    }
}