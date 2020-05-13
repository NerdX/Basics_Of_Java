//PROGRAM FOR INTODUCING AN ARRAYS IN JAVA.
public class Arrays_Intro{
    public static void main(String[] args) {
        int Array_1[] = new int[5];
        Array_1[0] = 10;
        Array_1[1] = 20;
        Array_1[2] = 30;
        Array_1[3] = 40;
        Array_1[4] = 50;
        System.out.println("ELEMENTS ARE = ");
        for(int i=0; i<Array_1.length; i++){
            System.out.println(Array_1[i]);
        }

    }
    

}