package fibonacci;

public class Fibonacci {
	public static void main(String[] args)
	{

		int a, b, c;
		a = 1;
		b = 1;
		int number = 1;
		System.out.print(a + ", ");
		System.out.print(b + ", ");
		while(number < 10)
		{
			c = a+b;
			System.out.print(c + ", ");
			a = b;
			b = c;
			number = number + 1;
		}
		
	}
}