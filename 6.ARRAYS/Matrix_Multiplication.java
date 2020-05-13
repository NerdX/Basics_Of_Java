//PROGRAM FOR MATRIX - MULTIPLICATION IN JAVA.
import java.util.Scanner;
public class Matrix_Multiplication{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // int Row = 0;
        // int Col = 0;
        // System.out.println("ENTER THE NO. OF ROWS");
        //  Row = Sc.nextInt();
        // System.out.println("ENTER THE NO. OF COLOUMS");
        //  Col = Sc.nextInt();
        int n = 3;
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        int C[][] = new int[n][n];

        System.out.println("ENTER FIRST ARRAY");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = Sc.nextInt();
            }
        }
        System.out.println("ENTER SECOND ARRAY");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                B[i][j] = Sc.nextInt();
            }
        }
        //CORE-LOGIC : - 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                C[i][j] = 0;
                for(int k=0; j<n; k++){
                    C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
                }
                
            }
        }
        System.out.println("MULTIPLICATION = ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(C[i][j]+" ");
            
            }
            System.out.println();
        }
        Sc.close();
    }
}