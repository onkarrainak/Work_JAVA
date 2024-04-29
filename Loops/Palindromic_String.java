import java.util.Scanner;

public class Palindromic_String {
    public static void main(String[] args) {
        
        String original, reverse = ""; 
      Scanner scanner = new Scanner(System.in);   
      System.out.print("Enter a string/number to check if it is a palindrome ");  
      original = scanner.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )
      {
         reverse = reverse + original.charAt(i);  
      } 
      System.out.println(original);
      System.out.println(reverse);
      if (original.equals(reverse)) 
      { 
         System.out.println("Entered string/number is a palindrome.");  
      }
      else
      {
         System.out.println("Entered string/number isn't a palindrome."); 
      }
   }
    
}
