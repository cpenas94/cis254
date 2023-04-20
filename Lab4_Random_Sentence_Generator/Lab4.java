/**
 * Description of program: This program generates a specified number of random sentences using randomly
 * selected words from the arrays.
 * @author Henry Penas, Eric Orea
 * @since 04/15/2023
 */

import java.util.Random;
import java.util.Scanner;


public class Lab4 {
	
	/**
	 * Creates a welcome message and ask the user to input the number of sentences generated.
	 * Created the arrays needed for the program and generate random sentences
	 * @param args an array consisting of articles, nouns, verbs and prepositions
	 */
	
    public static void main(String[] args) {
        int numSentences = 0;
        StringBuilder allSentences = new StringBuilder();

        do {
        	System.out.println("Welcome to the Random Sentence Generator!");
            System.out.println("Enter the number of random sentences (only 1 - 25): ");
            numSentences = getIntInput();
        } while (numSentences < 1 || numSentences > 25);

        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"guy", "girl", "gentlemen", "woman", "kitty", "doggy", "town", "bar"};
        String[] verbs = {"walked", "ran", "sang", "danced", "tripped", "sneezed"};
        String[] prepositions = {"to", "from", "over", "under", "on", "by", "for", "away", "towards", "around", "near"};

        for (int i = 0; i < numSentences; i++) {
            String sentence = generateRandomSentence(articles, nouns, verbs, prepositions);
            allSentences.append(sentence).append(".\n");
        }

        System.out.println("Here are " + numSentences + " sentences as requested:");
        System.out.println(allSentences.toString());
    }

    /**
     * Generates a random sentence using randomly selected words from the array
     * @param articles - an array of articles
     * @param nouns - an array of nouns
     * @param verbs - an array of verbs
     * @param prepositions - an array of prepositions
     * @return - a randomly generated sentence
     */
    
    public static String generateRandomSentence(String[] articles, String[] nouns, String[] verbs, String[] prepositions) {
        StringBuilder sentence = new StringBuilder();
        Random random = new Random();

        int article = random.nextInt(articles.length);
        int noun = random.nextInt(nouns.length);
        int verb = random.nextInt(verbs.length);
        int preposition = random.nextInt(prepositions.length);
        int secondArticle = random.nextInt(articles.length);
        int secondNoun = random.nextInt(nouns.length);

        String capitalizedArticle = articles[article].substring(0, 1).toUpperCase() + articles[article].substring(1);

        sentence.append(capitalizedArticle).append(" ");
        sentence.append(nouns[noun]).append(" ");
        sentence.append(verbs[verb]).append(" ");
        sentence.append(prepositions[preposition]).append(" ");
        sentence.append(articles[secondArticle]).append(" ");
        sentence.append(nouns[secondNoun]).append("");
        return sentence.toString();
    }

    /**
     * Reads the input and returns it
     * @return - an integer inputed by the user
     */
    
    public static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        return input;
    }
}
