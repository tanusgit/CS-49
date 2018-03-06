package digitspell;

public class Digit {
	public static void main (String args []){
		int b = num(-2);
		
	}
	public static int num(int a){
		if (a < 0){
			 a = a * -1;
			 System.out.print("negative ");
			 digit(a);
		} return a;
	}
	public static int digit(int a){
		if (a == 0){
			System.out.print("zero"); 
				}
		if (a == 1){
		System.out.print("one"); 
			}
		if (a == 2){
			System.out.print("two"); 
			}
		if (a == 3){
			System.out.print("three"); 
			}
		if (a == 4){
			System.out.print("Four"); 
			}
		if (a == 5){
			System.out.print("Five"); 
			}
		if (a == 6){
			System.out.print("Six"); 
			}
		if (a == 7){
			System.out.print("seven"); 
			}
		if (a == 8){
			System.out.print("eight"); 
			}
		if (a == 9){
			System.out.print("nine"); 
			}
		return a;
	}
}
