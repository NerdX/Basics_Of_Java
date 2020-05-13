//PROGRAM FOR IF-ELSE_IF-ELSE STATEMENT IN JAVA.
public class Else_If_Statement{
    public static void main(String[] args) {
        int No = 23;

        if(No<=10){
            System.out.println("NUMBER IS LESS THAN 10");
        }
        else if(No>10 && No<=20){
            System.out.println("NUMBER IS GREATER THAN 10 & LESS THAN 20");
        }
        else if(No>20 && No<=30){
            System.out.println("NUMBER IS GREATER THAN 20 & LESS THAN 30");
        }
        else{
            System.out.println("NUMBER IS GREATER THAN 30");
        }

    }
}