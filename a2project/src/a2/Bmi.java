package a2;
//I have calculated BMI means body mass index here for a random person.
class Bmi {
    public static void main(String args[]) {
   	float height = 162;
  	float h2 = (height/100) * (height/100);
 
 
    float weight= 50;
    float Bmi = weight/h2;
    System.out.print("The BMI of a person with Weight = " + weight +
    		"kg, and Height = " + height + "cm is " + Bmi);
    	
    }
}