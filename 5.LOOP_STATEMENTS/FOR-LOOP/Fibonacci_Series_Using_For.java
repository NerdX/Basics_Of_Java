//PROGRAM FOR GENERATING FIBONACCI-SERIES USNG FOR-LOOP.
import java.util.Scanner;
public class Fibonacci_Series_Using_For{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        int c = 0;
        
        //CORE-LOGIC : -
        for(int i=2; i<No; i++){

            c = (a+b);
            System.out.print(c+" ");
            a = b;
            b = c;

        }
        Sc.close();
    }
}