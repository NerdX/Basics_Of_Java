//PROGRAM FOR CREATING BASIC CALCULATOR.
import java.util.Scanner;
public class Basic_Calculator{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER");
        int a = Sc.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int b = Sc.nextInt();

        Sc.nextLine();
        System.out.println("ENTER WHICH OPERATION YOU WANT TO PERFORM");
        char Ops = Sc.nextLine().charAt(0);

        switch(Ops){

            case '+':
            System.out.println("ADDITION IS = "+(a+b));
            break;

            case '-':
            System.out.println("SUBTRACTION IS = "+(a-b));
            break;

            case '*':
            System.out.println("MULTIPLICATION IS = "+(a*b));
            break;

            case '/':
            // float Result = (a/b);
            System.out.println("DIVISION IS = "+(a/b));
            break;

            default:
            System.out.println("INVALID OPEARATION!");
        }
            Sc.close();
            
    }
}