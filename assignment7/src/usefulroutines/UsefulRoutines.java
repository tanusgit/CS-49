package usefulroutines;

public class UsefulRoutines {
	public static void main(String args[]){
	pull(22);
		
		
		
	}
	public static int spellDigitneg(int a){
	if (a < 0 ){
		a = a* -1;
		System.out.print("negative ");
		spellDigit(a);
		}return a;
	}
	
		public static void pull(int a){
		int tens = a / 10;
		int rem = a % 10;
		int b = spellDigit(rem);
		if (tens == 2){
			System.out.print("twenty " + b);
		}
		if (tens == 3){
			System.out.print("Thirty");
		}
		if (tens == 4){
			System.out.print("Fourty");
		}
		if (tens == 5){
			System.out.print("Fifty");
		}
		if (tens == 6){
			System.out.print("Sixty");
		}
		if (tens == 7){
			System.out.print("Seventy");
		}
		if (tens == 8){
			System.out.print("Eighty");
		}
		if (tens == 9){
			System.out.print("Ninety");
		}
		
	}
		public static int spellDigit(int a){
			if (a == 1 ){
				System.out.println("one");
			}
			if (a == 2 ){
				System.out.print("two");
			}
			if (a == 3 ){
				System.out.println("three");
			}
			if (a == 4 ){
				System.out.println("four");
			}
			if (a == 5 ){
				System.out.println("five");
			}
			if (a == 6){
				System.out.println("six");
			}
			if (a == 7){
				System.out.println("seven");
			}
			if (a == 8){
				System.out.println("eight");
			}
			if (a == 9){
				System.out.println("nine");
			}
			if (a == 0 ){
				System.out.println("zero");
			}
			if (a == 11 ){
				System.out.print("eleven");
			}
			if (a == 12 ){
				System.out.print("tweleve");
			}
			if (a == 13 ){
				System.out.print("thirteen");
			}
			if (a == 14 ){
				System.out.print("fourteen");
			}
			if (a == 15 ){
				System.out.print("fifteen");
			}
			if (a == 16){
				System.out.print("sixteen");
			}
			if (a == 17){
				System.out.print("seventeen");
			}
			if (a == 18){
				System.out.print("eighteen");
			}
			if (a == 19){
				System.out.print("nineteen");
			}
			return a;
		}

}
