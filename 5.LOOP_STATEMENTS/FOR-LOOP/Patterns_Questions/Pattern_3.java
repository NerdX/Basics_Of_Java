import java.util.Scanner;
public class Pattern_3{
	public static void main(String[] args) {
			
			Scanner Sc = new Scanner(System.in);
        	System.out.println("ENTER A NUMBER");
        	int N = Sc.nextInt();

        	for(int i = 1 ; i <= N ; i++){

        		for(int j = 1 ; j <= i - 1 ; j++){
        			System.out.print("  ");
        		}

        		for(int j = 1; j <= N - i + 1 ; j++){
        			System.out.print("* ");
        		}
        		System.out.println();
        	}
	}
}