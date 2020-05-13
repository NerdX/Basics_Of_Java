//PROGRAM FOR CALCULATE THE SUM OF GIVEN SERIES : - 1 + 1/2 + 1/3 + 1/4 + 1/5 + ..... 1/N.
import java.util.Scanner;
public class Series1_Using_For{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();

        float Result = 0;

        //CORE-LOGIC.
        for(float i=1; i<=No; i++){
            Result = (Result + 1/i);
        }
        System.out.println("RESULT = "+" "+Result);
        Sc.close();
    }
}