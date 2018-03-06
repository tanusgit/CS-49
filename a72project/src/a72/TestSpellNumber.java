package a72;


public class TestSpellNumber {
	// Prints all numbers from -99 to 99 spelled out.
	public static void main(String args [])  {
		for(int i = -99; i <= 99; i++) {
			String p = UsefulRoutines7.spellNumber(i);
			System.out.println(p);
		}
	}
}


