public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Original a: " + a);

        // Unary plus
        int unaryPlus = +a;
        System.out.println("Unary plus (+a): " + unaryPlus);

        // Unary minus
        int unaryMinus = -a;
        System.out.println("Unary minus (-a): " + unaryMinus);

        // Increment operator
        int increment = ++a; // Pre-increment
        System.out.println("Pre-increment (++a): " + increment);
        System.out.println("Value of a after pre-increment: " + a);

        increment = a++; // Post-increment
        System.out.println("Post-increment (a++): " + increment);
        System.out.println("Value of a after post-increment: " + a);

        // Decrement operator
        int decrement = --a; // Pre-decrement
        System.out.println("Pre-decrement (--a): " + decrement);
        System.out.println("Value of a after pre-decrement: " + a);

        decrement = a--; // Post-decrement
        System.out.println("Post-decrement (a--): " + decrement);
        System.out.println("Value of a after post-decrement: " + a);

         
    }
}
