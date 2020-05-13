//PROGRAM FOR WHICH ACCEPTS INPUT FROM USER ANN IT TERMINATES WHEN USER ENTER A NAGATIVE VALUE(INPUT) USING DO-WHILE LOOP.
import java.util.Scanner;
public class User_Input_Ngative{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int No = 1;
         do{
             System.out.println("ENTER A NUMBER");
               No = Sc.nextInt();
         }while(No > 0);
         Sc.close();
    }
}