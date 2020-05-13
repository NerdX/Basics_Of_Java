//PROGRAM WHICH PRINT THE TABLES FROM 1 - TO - 20 USING NESTED - FOR LOOP.
public class Table_20_Nested_For{
    public static void main(String[] args) {
        
        for(int i=1 ; i<=20 ; i++){

                int Table_Of = i;

            for(int j=1 ; j<=10; j++){

                System.out.print(Table_Of * j + " ");
            }
            
            System.out.println();
        }
    }
}