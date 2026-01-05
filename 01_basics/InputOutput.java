import java.util.Scanner; // import Scanner class

public class InputOutput {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a+b ;
        System.out.println(sum);

        // single line comment 
        /*
        
        multi line comment
        
        */
     Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
      
     int number = sc.nextInt();
System.out.println(number);


float price = sc.nextFloat();
System.out.println(price);
/*

        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        
nextByte
nextFloat
nextDouble
nextInt
nextBoolean
nextLong
nextShort


*/

    }
}
