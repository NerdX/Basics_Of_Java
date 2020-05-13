import java.util.Scanner;
public class Pattern_1{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();

        for(int i=1; i<=No; i++){
            for(int j=1; j<=No; j++){
                
                System.out.print("* ");
            }
            System.out.println();
        }
        Sc.close();
    }
}