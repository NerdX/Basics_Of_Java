//PROGRAM FOR FINDING FACTORIAL OF GIVEN NUMBER USING FOR-LOOP.
import java.util.Scanner;
public class Factorial_Using_For{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();
        int Result = 1;

        for(int i=1; i<=No; i++){
            Result = Result * i;
        }
        System.out.println("FACTORIAL OF GIVEN NUMBER = "+Result);
        Sc.close();
    }
}