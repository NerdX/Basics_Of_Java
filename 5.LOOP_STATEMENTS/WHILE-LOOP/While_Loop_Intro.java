//PROGRAM FOR WHILE-LOOP IN JAVA.
//PROGRAM FOR FINDING THE SUM OF ALL DIGITS OF GIVEN NUMBER.
import java.util.Scanner;
public class While_Loop_Intro{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();

        int Sum = 0;
        //CORE-LOGIC: - 
        while(No>0){
            int L_Digit = No % 10;
            No = No / 10;
            Sum = Sum + L_Digit;
        }
        System.out.println("THE SUM = "+" "+Sum);
        Sc.close();
    }
}