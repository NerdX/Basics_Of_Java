//PROGRAM WHICH FIND THE MAXIMUM OUT OF THREE NUMBERS.
public class Ternary_Ops_Max_Three{

	public static void main(String[] args) {

		int A = 10;
		int B = 20;
		int C = -5;

		int Answer = (A > B) ? (A > C) ? A : C : (B > C) ? B : C;
		System.out.println("MAXIMUM IS = " + Answer);
		
	}
}