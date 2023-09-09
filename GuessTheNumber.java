package Inheritance.Array.test;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int maxAttempts = 10;
        int attempts = 0;
        int score = 0;
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I've picked a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                score = maxAttempts - attempts + 1;
                System.out.println("Your score: " + score);
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Try again! Your guess is too low.");
            } else {
                System.out.println("Try again! Your guess is too high.");
            }
        }
        
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + generatedNumber);
        }
        
        scanner.close();
    }
}

