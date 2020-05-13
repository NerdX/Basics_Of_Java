import java.util.Scanner;
public class Pattern_2{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();

        for(int i=0; i<No; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        Sc.close();
    }
}