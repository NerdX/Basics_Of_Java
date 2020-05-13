//PROGRAM FOR LOGICAL-OPERATORS IN JAVA.
public class Logical_Ops{
    public static void main(String[] args) {
        //LOGICAL - AND OPERATOR.
        int n = 45;
        if(n>=1 && n<=100){
            System.out.println("GIVEN NUMBER IS IN THE RANGE");
        }
        else{
            System.out.println("GIVEN NUMBER IS NOT IN THE RANGE");
        }

        //LOGICAL - OR OPERATOR.
        int Grade = 10;
        if(Grade == 10 || Grade == 12){
            System.out.println("YOU CAN GIVE BOARD EXAMS");
        }
        else{
            System.out.println("YOU CAN'T GIVE BOARD EXAMS");
        }

        //LOGICAL - NOT OPERATOR.
        int G = 11;
        if(!(G == 10 || G == 12)){
            System.err.println("YOU CAN'T GIVE BOARD EXAMS");
        }
        else{
            System.out.println("YOU CAN GIVE BOARD EXAMS");
        }
        
    }
}