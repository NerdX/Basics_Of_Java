//PROGRAM FOR FINDING THE SUM OF ALL DIGITS OF GIVEN NUMBER USING FOR-LOOP.
import java.util.Scanner;
public class Sum_Of_Digits{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();
        int Sum = 0;
        int N = (int)Math.log10(No) + 1;
        for(int i=0; i<N; i++){
            int L_Digit = No % 10;
            No = No / 10;
            Sum = Sum + L_Digit;
        }
        System.out.println("SUM = "+" "+Sum);
        Sc.close();
    }
}