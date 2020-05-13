//PROGRAM FOR MATRIX-ADDITION IN JAVA.
import java.util.Scanner;
public class Matrix_Additiion{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("ENTER THE DIAMENSIONS");
        int N = Sc.nextInt();
        
        int A[][] = new int[N][N];
        int B[][] = new int[N][N];
        int C[][] = new int[N][N];

        System.out.println("ENTER FIRST ARRAY");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                A[i][j] = Sc.nextInt();
            }
        }
        System.out.println("ENTER SECOND ARRAY");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                B[i][j] = Sc.nextInt();
            }
        }
        //ADDITION OF MATRIX.
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("ADDITION = ");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(C[i][j]+" ");
            
            }
            System.out.println();
        }
        Sc.close();
    }
}