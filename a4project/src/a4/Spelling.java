package a4;

import java.util.Scanner;//This program will spell single digit number

public class Spelling {
	public static void main(String args[]) {
	Scanner inside = new Scanner(System.in);
		int num;
		System.out.print("enter digit ");
		num = inside.nextInt();
		if (num < -9 || num > 9) {
			System.out.print("Invalid number can't be printed");
			inside.close();
			return;
			
		}
		if (num < 0) {
			System.out.print("Negative ");
			num = num * -1;
		}
		if (num == 1)
			System.out.print("One");
		if (num == 2)
			System.out.print("Two");
		if (num == 3)
			System.out.print("Three");
		if (num == 4)
			System.out.print("Four");
		if (num == 5)
			System.out.print("Five");
		if (num == 6)
			System.out.print("Six");
		if (num == 7)
			System.out.print("Seven");
		if (num == 8)
			System.out.print("Eight");
		if (num == 9)
			System.out.print("Nine");
		if (num == 0)
			System.out.print("Zero");
		
		/*switch (num){
		case 0:
			System.out.print("Zero");
		}*/
		inside.close();
	}

}
