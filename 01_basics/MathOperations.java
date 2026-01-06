import java.util.*;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PROMPT the user so they know what to do
        System.out.print("Enter first number (a): "); 
        int a = sc.nextInt();
        
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division (Fixed for decimals)
        if (b != 0) {
            // Cast 'a' to float to get decimal results (e.g., 5/2 = 2.5)
            float quotient = (float) a / b;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Error: Division by zero");
        }

        // Area of circle
        System.out.print("Enter radius for circle area: "); // Added prompt here too
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area of circle: " + area);

        // Good practice: Close the scanner
        sc.close();
    }
}