//PROGRAM FOR NESTED IF-ELSE STATEMENT IN TERNARY-OPERATOR IN JAVA.
public class Nesting_Ternary_Ops{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int Result = (a>b) ? (a>c) ? a:c:(b>c) ? b:c;
        System.out.println("MAXIMUM IS = "+Result);
    }
}