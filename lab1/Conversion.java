import java.util.Scanner;

 /**
 * Description: Converts temperature between Celsius and Fahrenheit
 * @author Henry Penas, Eric Orea
 * @since 02/23/2023
 */



public class Conversion {
	
	/**
	* Main Method
	* @author Henry Penas
	*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value;
        int choice;

        do {
        	
            choice = menu(input);

            switch (choice) {
                case 1:
                    System.out.print("Enter value in Celsius: ");
                    value = input.nextDouble();
                    System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", value, celsiusToFahrenheit(value));
                    break;
                case 2:
                    System.out.print("Enter value in Fahrenheit: ");
                    value = input.nextDouble();
                    System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", value, fahrenheitToCelsius(value));
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        input.close();
    }

     /**
     * Menu Method
     * @Author Eric Orea
     * Displays a menu of options
     */
    public static int menu(Scanner input) {
        System.out.println("Select an option:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

     /** @Author Eric Orea
     * @param value temperature in celsius
     * @return temperature in fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

     /**
     * @Author Henry Penas
     * @param value temperature in fahrenheit 
     * @return temperature in celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
