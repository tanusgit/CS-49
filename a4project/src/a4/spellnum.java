public static void spellNum1(int num) {
		if (num < 0) {
			System.out.print("negative ");
			num = num * -1;			
		}
		int tens = num / 10;
		int rem = num % 10;
		switch(tens) {
		case 2:
			System.out.print("Twenty");
			break;
		case 3:
			System.out.print("Thirty");
			break;
		case 4:
			System.out.print("Forty");
			break;
		case 5:
			System.out.print("Fifty");
			break;
		case 6:
			System.out.print("Sixty");
			break;
		case 7:
			System.out.print("Seventy");
			break;
		case 8:
			System.out.print("Eighty");
			break;
		case 9:
			System.out.print("Ninety");
			break;
		}

		if (num < 10 || num > 19) {
			if (rem != 0) {
				System.out.print(" ");
				spellDigit(rem);
			}
			System.out.print("\n");
			return;
		}

		if (num == 10)
			System.out.println("Ten");
		if (num == 11)
			System.out.println("Eleven");
		if (num == 12)
			System.out.println("Twelve");
		if (num == 13)
			System.out.println("Thirteen");
		if (num == 14)
			System.out.println("Fourteen");
		if (num == 15)
			System.out.println("Fifteen");
		if (num == 16)
			System.out.println("Sixteen");
		if (num == 17)
			System.out.println("Seventeen");
		if (num == 18)
			System.out.println("Eighteen");
		if (num == 19)
			System.out.println("Nineteen");
	}
	
	public static void spellDigit(int num) {
		if (num < -9 || num > 9) {
			System.out.print("Invalid number can't be printed: "+num+"\n");
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
	}
}