//PROGRAM FOR CHECK WHETHER A GIVEN NUMBER IS PALINDROME OR NOT.
import java.util.Scanner;
public class Palindrome_No {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();
        int Temp = No;
        int Reverse = 0;

        while(No>0){
            int L_Digit = No % 10;
            Reverse = (Reverse * 10) + L_Digit;
            No = No / 10;
        }
        if(Temp == Reverse){
            System.out.println("GIVEN NUMBER IS PALINDROME");
        }
        else{
            System.out.println("GIVEN NUMBER IS NOT PALINDROME");
        }
        Sc.close();

    }
}