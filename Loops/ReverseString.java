import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.reverse();
        String reversedString = stringBuffer.toString();

        System.out.println("Reversed string: " + reversedString);
    }
}
