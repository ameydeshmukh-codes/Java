public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Initial value of a: " + a);

        // Simple assignment
        a = 10;
        System.out.println("After simple assignment (a = 10): " + a);

        // Addition assignment
        a += 5; // Equivalent to a = a + 5
        System.out.println("After addition assignment (a += 5): " + a);

        // Subtraction assignment
        a -= 3; // Equivalent to a = a - 3
        System.out.println("After subtraction assignment (a -= 3): " + a);

        // Multiplication assignment
        a *= 2; // Equivalent to a = a * 2
        System.out.println("After multiplication assignment (a *= 2): " + a);

        // Division assignment
        a /= 4; // Equivalent to a = a / 4
        System.out.println("After division assignment (a /= 4): " + a);

        // Modulus assignment
        a %= 3; // Equivalent to a = a % 3
        System.out.println("After modulus assignment (a %= 3): " + a);
    }
}
