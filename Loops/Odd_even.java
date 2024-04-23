
import java.util.Scanner;

public class Odd_even {

    public static void main(String[] args) {
        int num ;
        int sum_odd = 0;
        int Sum_even = 0;

        
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) 
            {
                
                Sum_even = Sum_even + i; 
                
            }            
            else {
                sum_odd = sum_odd + i;
            }
        }
        System.out.println("Sum of all even number id " + Sum_even);
        System.out.println("Sum of all od number id " + sum_odd);

    }
}