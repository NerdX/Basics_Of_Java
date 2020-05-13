//PROGRAM FOR CREATING RAISE-TO-FUCTION USING FOR-LOOP.
import java.util.Scanner;
public class Raise_To_Fuction_Using_For{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();
        System.out.println("ENTER A POWER");
        int Power = Sc.nextInt();

        int Result = 1;

        //CORE-LOGIC : -
        for(int i=1; i<=Power; i++){
            Result = (Result * No);
        }
        System.out.println("RESULT = "+" "+Result);
        Sc.close();
    }
}