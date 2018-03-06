package a5;
import java.util.Scanner;//This is a guessing game program
public class GuessingGame {
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		for (boolean guessed = false; guessed == false;) {
			int SecretNumber = 5;
			int guessnum;
			System.out.print("Guess the secret number: ");
			guessnum = scanner.nextInt();

			if (guessnum == SecretNumber) {
				System.out.print("Congratulations! You guessed it.");
				guessed = true;
			}
			else
				System.out.println("Not correct. Try again");	
		}
		scanner.close();
}}
