package use;
import java.util.Scanner;
public class Guess {
	
	public static void main(String args[]){
		Scanner m = new Scanner(System.in);
		
		while(true){
			int secretNum = 5;
			System.out.println("Please guess the number");
			int input = m.nextInt();
			if (input != secretNum){
				continue;
				}
			else {
				System.out.println("congratulations! you guessed it");
				break;
				}
			
			
		}
		
	}
	

}
