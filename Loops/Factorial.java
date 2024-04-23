import java.util.Scanner;

public class Factorial 
{
    public static void main(String args[]){  
    int i,fact=1;  
    int num;
    Scanner scanner = new Scanner(System.in);
    num = scanner.nextInt();
    //It is the number to calculate factorial    
    for(i=1;i<=num;i++){    
        fact=fact*i;    
    }    
    System.out.println("Factorial of "+num+" is: "+fact);    
   }  
}
