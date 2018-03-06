package ascending;

public class Ascend {
	public static void main(String[] args){
		int a = 300;
		int b = 40;
		int c = 22;
		if(a>b){
			if(a>c)
				System.out.print("A is greater");
			else
				System.out.print("B is greater");
		}

			
		if (b>c){
			if (b>a)
				System.out.print("B is greater");
			else 
				System.out.print("c is greater");
			}
		
		if(c>b){
			if(c>a)
				System.out.print("c is greater");
			else
				System.out.print("B is greater");
		}
		}

}
