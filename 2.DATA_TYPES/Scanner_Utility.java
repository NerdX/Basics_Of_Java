//PROGRAM FOR SCANNER_CLASS_UTILITY.

//IMPORTing SCANNER_CLASS.
import java.util.Scanner;
public class Scanner_Utility{
    public static void main(String[] args) {
        //CREATE AN OBJECT OF SCANNER_CLASS.
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER YOUR PRINCIPLE");

        //TAKE INPUT FROM USER.
        int PRINCIPLE = Sc.nextInt();

        System.out.println("ENTER YOUR RATE");
        float RATE = Sc.nextFloat();

        System.out.println("ENTER YOUR TIME PERIOD");
        int TIME = Sc.nextInt();

        float Result = (PRINCIPLE*RATE*TIME)/100;
        System.out.println("SIMPLE INTREST = "+Result);
        Sc.close();
    }
}