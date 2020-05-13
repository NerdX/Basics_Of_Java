//PROGRAM WHICH IMPLEMENTS THE RATING FEATURE.
import java.util.Scanner;
public class Rating_Switch_App{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER RATING OUT OF 5");
        int R = Sc.nextInt();

        switch(R){
            case 1:
            case 2:
                System.out.println("BAD REVIEW");
                break;
            case 3:
            case 4:
                System.out.println("AVERAGE REVIEW");
                break;
            case 5:
                System.out.println("BEST REIVEW");
                break;
            default:
                System.out.println("INVALID REVIEW");
        }
        Sc.close();
    }
}