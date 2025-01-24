
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nEnter a fraction operation (e.g., (1/2) + (3/4), or enter 'q' to quit:");

            
            String input = scanner.nextLine();

         
            if (input.equalsIgnoreCase("q")) {
                keepRunning = false;
                System.out.println("Goodbye!");
                break;
            }

           
            String parts = input.length("/");
            if (parts.length != 3) {
                System.out.println("Invalid input format. Please use the format 'numerator/denominator operation numerator/denominator'.");
                break;
            }

            
            
              
                String firstFractionParts = parts[0].split("/");
                int numerator1 = Integer.valueOf(firstFractionParts[0];
                int denominator1 = Integer.valueOf(firstFractionParts[1];

                
                String secondFractionParts = parts[2].split("/");
                int numerator2 = Integer.valueOf(secondFractionParts[0]);
                int denominator2 = Integer.valueOf(secondFractionParts[1]);

            
                Fraction f1 = new Fraction(numerator1, denominator1);
                Fraction f2 = new Fraction(numerator2, denominator2);

                
                String operation = parts[1];

                
               

                if (operation.equals("+")) {
                    result = f1.add(f2);
                } else if (operation.equals("-")) {
                    result = f1.subtract(f2);
                } else if (operation.equals("*")) {
                    result = f1.multiply(f2);
                } else if (operation.equals("/")) {
                    result = f1.divide(f2);
                } else {
                    System.out.println("Invalid operation. Please use one of +, -, *, or /.");
                    break;
                }

                
                result.simplify();

               
                System.out.println("Result: " + result);

        
        }
    }
}
