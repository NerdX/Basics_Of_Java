//PROGRAM FOR THE CONCEPT OF TYPE-CASTING.
public class Type_Casting{
    public static void main(String[] args) {
        //IMPLICIT:TYPE-CASTING.
        byte X = 10;
        short Y = 200;
        int Result = X;
        System.out.println("THE VALUE OF X = "+Result);
        Result = Y;
        System.out.println("THE VALUE OF Y = "+Result);

        //EXPLICIT:TYPE-CASTING.
        double M = 1024.567890;
        float N = 3.14f;
        Result = (int)M;
        System.out.println("THE VALUE OF M = "+Result);
        Result = (int)N;
        System.out.println("THE VALUE OF N = "+Result);

    }
}