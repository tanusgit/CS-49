package a1;

public class abcd {
	public static int greater(int a, int b, int c, int d){
		if (a > b){
			if (a > c){
				if (a > d)
					return a;
				else 
					return d;
			} else { // c>a
				if(c > d)
					return c;
				else 
					return d;
			}
		} else { // b>a
			if (b > c){
				if (b > d){
					return b;}
				else 
					return d;
			}		
			else {//c > b
				if (c > d){
					return c;
				}
				else
					return d;
			}
		}
	}

}
