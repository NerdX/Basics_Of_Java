//PROGRAM FOR NESTED IF-ELSE STATEMENT IN JAVA.
public class Nested_If_Else{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if(a>b){
            if(a>c){
                System.out.println("A IS MAXIMUM");
            }
        }
        if(b>c){
            System.out.println("B IS MAXIMUM");
        }
        else{
            System.out.println("C IS MAXIMUM");
        }

    }
}