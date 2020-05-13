//PROGRAM WHICH DESCRIBES THE VARIOUS FUCTIONS OF STRING IN JAVA.
public class Fuctions_Of_String_2{
    public static void main(String[] args) {
        
        String Name = "MARTIN GARRIX";

        //7.BOOLEAN EQUALS(ANOTHER OBJECT): - 
        String Name2 = "ALAN WALKER";
        System.out.println(Name.equals(Name2));

        //8.BOOLEAN ISEMPTY(): - 
        System.out.println(Name.isEmpty());
        String Name3 = "";
        System.out.println(Name3.isEmpty());

        //9.STRING CONCATE(STRING STR): - 
        System.out.println(Name.concat(" SIR"));

        //10.STRING REPLACE(CHAR OLD , CHAR NEW): - 
        System.out.println(Name.replace("GARRIX", "WALKER"));
        System.out.println();

        //11.STRING [] SPLIT(STRING REGEX): - 
        String DJs = "HARDWELL,MARTIN GARRIX,TIESTO,W&W,KSHMR,MADDIX,ANGEMI";
        String Name_DJs[] = DJs.split(",");
        for(int i=0; i<Name_DJs.length; i++){
            System.out.println(Name_DJs[i]);
        }
    }
}