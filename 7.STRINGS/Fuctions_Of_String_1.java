//PROGRAM WHICH DESCRIBES THE VARIOUS FUCTIONS OF STRING IN JAVA.
public class Fuctions_Of_String_1{
    public static void main(String[] args) {
        
        String Name = "MARTIN GARRIX";

        //1.CHAR AT(INT INDEX): - 
        System.out.println(Name.charAt(3));

        //2.INT LENGTH(): - 
        int LENGTH = Name.length();
        System.out.println("LENGTH OF A STRING = "+LENGTH);

        //3.STRING SUBSTRING(INT BEGIN_INDEX): - 
        String Substring = Name.substring(3);
        System.out.println(Substring);

        //4.STRING SUBSTRING(INT BEGIN_INDEX , INT END_INDEX): - 
        String Substring_2 = Name.substring(3, 7);
        System.out.println(Substring_2);

        //5.BOOLEAN CONTAINS(CHAR_SEQUENCES S): - 
        System.out.println(Name.contains("G"));
    }
}