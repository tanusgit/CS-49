package a7;

public class UsefulRoutines7 {
		// Prints any two digit number  (-99 <= num <= 99) spelled out.
		public static String spellNumber(int num) {
			String s = "";
			if (num < 0) {
				// Print Negative and make the number positive for
				// later processing.
				s = "Negative ";
				 num = num * -1;
			}
			if (num <= 9)
				s = s + spellDigit(num);
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
			
			if (num > 20 && num < 30) {
				s = s + "Twenty ";
				int x = num - 20;
				s = s + spellDigit(x);
			}
			if (num > 30 && num < 40) {
				s = s + "Thirty ";
				int x = num - 30;
				s = s + spellDigit(x);
			}
			if (num > 40 && num < 50) {
				s = s + "Forty ";
				int x = num - 40;
				s = s + spellDigit(x);
			}
			if (num > 50 && num < 60) {
				s = s + "Fifty ";
				int x = num - 50;
				s = s + spellDigit(x);
			}
			if (num > 60 && num < 70) {
				s = s + "Sixty ";
				int x = num - 60;
				s = s + spellDigit(x);
			}
			if (num > 70 && num < 80) {
				s = s + "Seventy ";
				int x = num - 70;
				s = s + spellDigit(x);;
			}
			if (num > 80 && num < 90) {
				s = s + "Eighty ";
				int x = num - 80;
				s = s + spellDigit(x);
			}
			if (num > 90 && num < 100) {
				s = s + "Ninety ";
				int x = num - 90;
				s = s + spellDigit(x);;
			}
			if (num == 10)
				s = s + "Ten";
			if (num == 20)
				s = s + "Twenty";
			if (num == 30)
				s = s + "Thirty";
			if (num == 40)
				s = s + "Forty";
			if (num == 50)
				s = s + "Fifty";
			if (num == 60)
				s = s + "Sixty";
			if (num == 70)
				s = s + "Seventy";
			if (num == 80)
				s = s + "Eighty";
			if (num == 90)
				s = s + "Ninety";
			return s;
		}

		// Prints any single digit number (-9 <= num <= 9) spelled out.
		public static String spellDigit(int num) {
			String s = "";
			if (num < 0) {
				// Print Negative and make the number positive for
				// later processing.
				s = "Negative ";
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



