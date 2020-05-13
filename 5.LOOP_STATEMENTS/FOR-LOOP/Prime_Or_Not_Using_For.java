//PROGRAM FOR FINDING WHETHER A GIVEN NUMBER IS PRIME OR NOT USING FOR-LOOP.
import java.util.Scanner;
public class Prime_Or_Not_Using_For{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int No = Sc.nextInt();

        int Temp = 0;
        
        //CORE-LOGIC : -
        if(No < 2){
            System.out.println("GIVEN NUMBER IS NOT PRIME");
        }

        else{
            
        for(int i=2; i<No; i++){
        //for(int i=2; i*i<=No; i++)//OPTIMIZED-TECHNIQUE.
            if(No % i == 0){
                Temp = 1;
            }
        }
        if(Temp == 0){
            System.out.println("GIVEN NUMBER IS PRIME");
        }
        else{
            System.out.println("GIVEN NUMBER IS NOT PRIME");
        }
        }
        Sc.close();
    }
}