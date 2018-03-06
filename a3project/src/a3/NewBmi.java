package a3;
// I have used Scanner class to get input from the
// user to calculate bmi.
import java.util.Scanner;
public class NewBmi {
	public static void main(String args[]) {
		Scanner inside = new Scanner(System.in);
		float height;
		float weight;

		// Take input from the user
	System.out.print("enter the weight in kg: ");
		weight = inside.nextFloat();
		System.out.print("enter the height in cm: ");
		height = inside.nextFloat();

		// Calculate the BMI
		float h2 = (height/100) * (height/100);
		float bmi = weight/h2;

		// Print the result
		System.out.print("The bmi of a person with height " +
		height + "cm and weight " + weight + "kg is " + bmi);

		inside.close();
}}
