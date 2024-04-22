// 3.	Write a java program to reverse_the_given_number.
public class reverse_the_given_number {
    
public static void main(String[] args) {
    int num = 1234;
    int rem,rev = 0;

    while (num !=0) {
        rem = num %10;
        rev = rev * 10 + rem;
        num = num /10;
    }
    System.out.println("The Reverse number is " + rev);
}
}
