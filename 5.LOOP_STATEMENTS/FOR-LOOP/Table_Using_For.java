//PROGRAM FOR GENERATE A TABLE USING FOR-LOOP.
import java.util.Scanner;
public class Table_Using_For{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER = ");
        int No = Sc.nextInt();
        int Table = 0;

        for(int i=1; i<=10; i++){
            Table = (No * i);
            System.err.println(No + " * "+ i +" = "+" " + Table);
        }
        Sc.close();
    }
}