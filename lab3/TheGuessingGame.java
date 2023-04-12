/*
 * Description: CIS 254 Lab 3 - The Guessing Game
 * The Guessing Game is a game where the user chooses a random from 1 - 10. The users has 3 tries.
 * Group: 12
 * Authors: Henry Penas, Eric Orea
 * Date: 04-08-2023
 */

import java.util.Random;
import java.util.Scanner;

public class TheGuessingGame {
	
	/**
	 * Main method that starts the game
	 * @param User inputs number
	 * @return Returns if input is too high, too low, won or lost
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to The Guessing Game");
        
        while (playAgain) {
            int number = random.nextInt(10) + 1;
            int tries = 3;
            boolean guesses = false;
            
            System.out.println("I'm thinking of a number between 1 and 10." + "\n" + "Guess what it is:");

            while (tries > 0 && !guesses) {
                int guess = scanner.nextInt();
                if (guess < number) {
                    System.out.println("Too low! Tries Left: " + (tries - 1));
                } else if (guess > number) {
                    System.out.println("Too high! Tries Left: " + (tries - 1));
                } else {
                    System.out.println("You guessed it! The number was " + number + ".");
                    guesses = true;
                }
                tries--;
            }

            if (!guesses) {
                System.out.println("The number was " + number + ". Sorry, you have lost!");
            }

            System.out.println("Play again? (Y/N)");
            String playAgainInput = scanner.next();
            if (!playAgainInput.equalsIgnoreCase("Y")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
