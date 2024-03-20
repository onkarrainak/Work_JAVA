import java.util.Scanner;

public class simple_calculator
{
    public static void main(String[] args)
    {
        simple_calculator cal = new simple_calculator();
        char operator;
        System.out.println("**************************");
        System.out.println("Choose an operator: +, -, *, or /");
        Scanner s = new Scanner(System.in); 
        operator = s.next().charAt(0);

        cal.get_data();

        switch (operator) {
            case '+':
                cal.add();               
                    break;
            case '-':
                cal.sub();
                    break;
            case '*':
                cal.mul();               
                    break;
            case '/':
                cal.div();               
                    break;
            default:
                System.out.println("Invalid operator!");
                break;
        }        
    }

    int num1;
    int num2;
    double result;

    public void get_data()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers");
        System.out.println("Enter 1st number ");
        num1 = s.nextInt();
        System.out.println("Enter 2nd number ");
        num2 = s.nextInt();
    }

    public void add()
    {
        result = num1+num2;
        System.out.println("The Addition of given numbers is " + result);

    }
    public void sub()
    {
        result = num1-num2;
        System.out.println("The subtraction  of given numbers is " + result);

    }
    public void mul()
    {
        result = num1*num2;
        System.out.println("The multiplication  of given numbers is " + result);

    }
    public void div()
    {
        result = num1/num2;
        System.out.println("The division  of given numbers is " + result);

    }


}