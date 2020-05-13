//PROGRAM FOR CALCULATING THE AVERAGE OF GIVEN MARKS BY STUDENT.
import java.util.Scanner;
public class Average_Marks{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int Marks[] = new int[5];
        int Sum = 0;
        System.out.println("ENTER THE MARKS OF YOUR FIVE SUBJECT: - ");
            for(int i=0; i<Marks.length; i++){
                Marks[i] = Sc.nextInt();
                Sum = Sum + Marks[i];
            }
            float Result = Sum / 5;
            System.out.println("AVERAGE = "+" "+Result);
            Sc.close();
    }
    

}