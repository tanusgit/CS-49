package bmical;

import java.util.Scanner;
public class Bmi {
public static void main (String args []){
	Scanner m = new Scanner(System.in);
	Scanner n = new Scanner(System.in);
	System.out.print("enter height");
int height = m.nextInt();
System.out.print("enter weight");
int weight = n.nextInt();
int p = (height/100) *(height/100);
double bmi = weight / p;
System.out.print(bmi);
} }
