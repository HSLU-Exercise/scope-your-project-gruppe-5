import java.util.Scanner;

   // Simple console-based calculator in Java
   public class SimpleCalculator {

       // Adds two numbers and returns their sum
       public static double add(double x, double y) { // REMOVE COMMA FOR DEMO PURPOSES
           return x + y;
       }

       // Subtracts second number from first and returns the difference
       public static double subtract(double x, double y) {
           return x - y;
       }

       // Multiplies two numbers and returns their product
       public static double multiply(double x, double y) {
           return x * y;
       }

       // Divides first number by second, handles division by zero
       public static String divide(double x, double y) {
           if (y == 0) {
               return "Error: Cannot divide by zero!";
           }
           return String.valueOf(x / y);
       }

       // Main method to run the calculator program
       public static void main(String[] args) {
           // Initialize scanner for user input
           Scanner scanner = new Scanner(System.in);
           // Control loop for continuous operation
           boolean running = true;

           // Main loop to display menu and process choices
           while (running) {
               // Display calculator menu options
               System.out.println("\nSimple Calculator Menu:");
               System.out.println("1. Add");
               System.out.println("2. Subtract");
               System.out.println("3. Multiply");
               System.out.println("4. Divide");
               System.out.println("5. Exit");

               // Prompt for user choice
               System.out.print("Enter your choice (1-5): ");
               String choice = scanner.nextLine().trim();

               // Exit program if user selects 5
               if (choice.equals("5")) {
                   System.out.println("Goodbye!");
                   running = false;
                   continue;
               }

               // Validate user choice (1-4)
               if (!choice.matches("[1-4]")) {
                   System.out.println("Invalid choice. Please try again.");
                   continue;
               }

               // Handle potential invalid number inputs
               try {
                   // Get first number from user
                   System.out.print("Enter first number: ");
                   double num1 = Double.parseDouble(scanner.nextLine().trim());

                   // Get second number from user
                   System.out.print("Enter second number: ");
                   double num2 = Double.parseDouble(scanner.nextLine().trim());

                   // Variable to store operation result
                   String result;
                   // Process user choice and perform calculation
                   switch (choice) {
                       case "1":
                           result = String.valueOf(add(num1, num2));
                           System.out.printf("Result: %.2f + %.2f = %s%n", num1, num2, result);
                           break;
                       case "2":
                           result = String.valueOf(subtract(num1, num2));
                           System.out.printf("Result: %.2f - %.2f = %s%n", num1, num2, result);
                           break;
                       case "3":
                           result = String.valueOf(multiply(num1, num2));
                           System.out.printf("Result: %.2f * %.2f = %s%n", num1, num2, result);
                           break;
                       case "4":
                           result = divide(num1, num2);
                           System.out.printf("Result: %.2f / %.2f = %s%n", num1, num2, result);
                           break;
                   }
               } catch (NumberFormatException e) {
                   // Handle non-numeric input
                   System.out.println("Please enter valid numbers.");
               }
           }

           // Close scanner to prevent resource leak
           scanner.close();
       }
   }