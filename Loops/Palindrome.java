import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int r,sum=0,temp;    
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number ");
        int num = scanner.nextInt();
        int number = num;
        
        temp=num;    
        while(num>0){    
         r=num%10;   
         sum=(sum*10)+r;    
         num=num/10;    
        }    
        if(temp==sum) {   
         System.out.println(number +" is an palindrome number ");   
        } 
        else  {  
         System.out.println(number +" is an not palindrome");    
        }
    }
}
