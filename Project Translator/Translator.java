import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        String[] english = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
        String[] spanish = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez" };

        System.out.println("Hello Professor, I can translate numbers 1-10 in Spanish");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number in English: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            boolean found = false;
            for (int i = 0; i < english.length; i++) {
                if (english[i].equalsIgnoreCase(input)) {
                    System.out.println("Spanish translation is " + spanish[i]);
                    System.out.println();
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Not found");
                System.out.println();
            }
        }
        scanner.close();
        System.out.println("Goodbye!");
    }
}
