package a72;

public class UsefulRoutines7 {
	// Returned any number between -99 <= num <= 99 spelled out.
	public static String spellNumber(int num) {
		String s = "";
		if (num < 0) {
			s = "Negative ";
			num = num * -1;	//make number positive
		}
		int tens = num / 10;
		int rem = num % 10;
		switch(tens) {
		case 2:
			s = s + "Twenty ";
			break;
		case 3:
			s = s + "Thirty ";
			break;
		case 4:
			s = s + "Forty ";
			break;
		case 5:
			s = s + "Fifty ";
			break;
		case 6:
			s = s + "Sixty ";
			break;
		case 7:
			s = s + "Seventy ";
			break;
		case 8:
			s = s + "Eighty ";
			break;
		case 9:
			s = s + "Ninety ";
			break;
		}

		if (num < 10 || num > 19) {
			if (rem != 0) {
				s = s + spellDigit(rem);
			}
		}

		if (num == 0)
			s = s + "Zero";
		if (num == 10)
			s = s + "Ten";
		if (num == 11)
			s = s + "Eleven";
		if (num == 12)
			s = s + "Twelve";
		if (num == 13)
			s = s + "Thirteen";
		if (num == 14)
			s = s + "Fourteen";
		if (num == 15)
			s = s + "Fifteen";
		if (num == 16)
			s = s + "Sixteen";
		if (num == 17)
			s = s + "Seventeen";
		if (num == 18)
			s = s + "Eighteen";
		if (num == 19)
			s = s + "Nineteen";
		return s;
	}

	// Return a single digit number between 9 <= num <= 9 spelled out.
	public static String spellDigit(int num) {
		String s = "";
		if (num < -9 || num > 9) {
			System.out.print("Invalid number can't be printed: " + num + "\n");
			return s;
		}
		if (num < 0) {
			System.out.print("Negative ");
			num = num * -1;
		}
		if (num == 1)
			s = s + "One";
		if (num == 2)
			s = s + "Two";
		if (num == 3)
			s = s + "Three";
		if (num == 4)
			s = s + "Four";
		if (num == 5)
			s = s + "Five";
		if (num == 6)
			s = s + "Six";
		if (num == 7)
			s = s + "Seven";
		if (num == 8)
			s = s + "Eight";
		if (num == 9)
			s = s + "Nine";
		if (num == 0)
			s = s + "Zero";
		return s;
	}
}


