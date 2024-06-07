import java.util.Scanner;

public class Merchants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.print("Enter number one: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter number two: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter number three: ");
        int number3 = input.nextInt();
        
        // Compute the product, sum, and maximum of the entered numbers
        int product = number1 * number2 * number3;
        int sum = number1 + number2 + number3;
        int maximum = number1;
        
        if (number2 > maximum) {
            maximum = number2;
        }
        if (number3 > maximum) {
            maximum = number3;
        }
        
        // Display the results in a tabular format
        System.out.println("Product\tSum\tMaximum");
        System.out.println(product + "\t" + sum + "\t" + maximum);
        
        input.close();
    }
}
