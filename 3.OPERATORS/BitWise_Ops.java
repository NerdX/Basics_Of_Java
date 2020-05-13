//PROGRAM FOR BIT-WISE OPERATORS IN JAVA.
public class BitWise_Ops{
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println(("ANDing OF A & B = "+(a&b)));
        System.out.println("ORing OF A & B = "+(a|b));
        System.out.println("EXORing OF A & B = "+(a^b));
        System.out.println("THE SHIFTING OF A TO RIGHT BY 1 = "+(a>>1));
        System.out.println("THE SHIFTING OF B TO LEFT BY 1 = "+(b<<1));

    }
}