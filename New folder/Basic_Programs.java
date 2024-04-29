import java.util.Scanner;

public class Basic_Programs {
    int num;

    public static void main(String[] args) {
        Basic_Programs basic_Programs = new Basic_Programs();
        Scanner scanner = new Scanner(System.in);
        
        basic_Programs.run();
        

    }
    public void reverse_the_given_number(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        num = scanner.nextInt();
        
        int rem,rev = 0;
        while (num !=0) {
            rem = num %10;
            rev = rev * 10 + rem;
            num = num /10;
        }
        System.out.println("The Reverse number is " + rev);
    }

    public void Even_or_Odd()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        num = scanner.nextInt();
        String result;
        if (num%2==0)
           result = "Even";
        else 
            result = "Odd";

        System.out.println(num + " This number is " + result);
    }

    public void Table_of_given_Number()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number ");
        num = scanner.nextInt();
        int i;
        for (i=1;i<=10;i++){
            System.out.println(num +" * " + i + " =  " +
             num*i);
        }
    }

    public void Factorial()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number ");
        num = scanner.nextInt();

        int i,fact=1; 
        for(i=1;i<=num;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+num+" is: "+fact);    
    

    }

    public void Fibonacci()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number ");
        num = scanner.nextInt();
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);
    
        for(i=2;i<num;++i)
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
            
        }       
        System.out.println("");

    }


    public void ArmstrongNo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number ");
        num = scanner.nextInt();
        int ono, rem, sum = 0;
        ono = num;
        while ( ono != 0)
        {
            rem = ono % 10;
            sum= (int) (sum+ Math.pow(rem, 3));
            ono/= 10;
        }
        if(sum ==num){
            System.out.println(num + " is an Armstrong number.");
        }
        else{
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public void Palindrome()
    {
        int r,sum=0,temp;    
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number ");
        num = scanner.nextInt();
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
    
    public void run() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println(" ---------------------------- ");
            System.out.println("1. reverse_the_given_number");
            System.out.println("2. Even_or_Odd");
            System.out.println("3. Table_of_given_Number");
            System.out.println("4. Factorial");
            System.out.println("5. Fibonacci");
            System.out.println("6. ArmstrongNo");
            System.out.println("7. Palindrome");
            System.out.println("8. Exit");
            System.out.println(" ---------------------------- ");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                reverse_the_given_number();
                    break;
                case 2:
                    Even_or_Odd();
                    break;
                case 3:
                    Table_of_given_Number();
                    break;
                case 4:
                    Factorial();
                    break;
                case 5:
                    Fibonacci();
                    break;
                case 6:
                    ArmstrongNo();
                    break;
                case 7:
                    Palindrome();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 8);
    }

    
}



