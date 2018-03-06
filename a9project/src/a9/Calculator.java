package a9;
import java.util.Scanner;
public class Calculator {
	// Utility to round a number to two decimal places.
	public static double round2(double i) {
		return Math.round(i*100)/100.0;
	}
	// Compute area of a circle from radius
	public static void areaOfCircle() {
		double radius;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = s.nextDouble();

		// Area of circle = pi*r^2
		double area = Math.PI*radius*radius;
		area = round2(area);
		System.out.println("Area of circle is: " + area);
	}
	// Compute solutions to the quadratic equation
	// when coefficients are given.
	public static void quadraticEquation() {
		double a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A: ");
		a = s.nextDouble();
		System.out.print("Enter B: ");
		b = s.nextDouble();
		System.out.print("Enter C: ");
		c = s.nextDouble();
		// x = (-b +/- (b^2 - 4ac)^0.5)/2a
		double bac = b*b - 4*a*c;
		if (bac < 0) {
			// No real solutions, compute real and imaginary parts.
			double real = round2(-b/(2*a));
			double img = round2(Math.sqrt(-bac)/(2*a));
			System.out.println("Solutions to the equation are: "
								+ real + " + i" + img + ", "
								+ real + " - i" + img);
		} else {
			// Real solutions, print the answers.
			double x1 = (-b + Math.sqrt(bac))/(2*a);
			double x2 = (-b - Math.sqrt(bac))/(2*a);
			x1 = round2(x1);
			x2 = round2(x2);
			System.out.println("Solutions to the equation are: "
								+ x1 + ", " + x2);
		}
	}
	// Compute the total amount deposited with compounded interest.
	public static void compoundInterest() {
		// p = principal, r = rate of interest, t = number of years
		// n = rate at which interest is compounded per year.
		double p, r, t, n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter principal amount (the initial amount you borrow or deposit): ");
		p = s.nextDouble();
		System.out.print("annual rate of interest (as a decimal): ");
		r = s.nextDouble();
		System.out.print("Enter number of years the amount is deposited or borrowed for: ");
		t = s.nextDouble();
		System.out.print("Enter number of times the interest is compounded per year: ");
		n = s.nextDouble();
		// A = P(1+r/n)^nt
		double compound = 1+(r/n);
		double nt = n*t;
		double compound2 = p*Math.pow(compound, nt);
		compound2 = round2(compound2);
		System.out.println("The total amount is: " + compound2);
	}
	public static void main(String args[]) {
		while(true) {
			System.out.println("1. Area of Circle");
			System.out.println("2. Solve a Quadratic Equation");
			System.out.println("3. Compound interest");
			System.out.println("4. Exit");
			System.out.print("Enter a value: ");
			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				areaOfCircle();
				break;
			case 2:
				quadraticEquation();
				break;
			case 3:
				compoundInterest();
				break;
			case 4:
				return;
			}
		}
	}
}
