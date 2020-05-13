//PROGRAM FOR SWITCH-CASE STATEMENT IN JAVA.
public class Switch_Case_Intro{
    public static void main(String[] args) {
        int dayofweek = 4;

        switch(dayofweek){

            case 1:
            System.out.println("I'M ON LEAVE");
            break;

            case 2:
            System.out.println("I'M IN OFFICE");
            break;

            case 3:
            System.out.println("I'M PLAYING FOOTBALL");
            break;

            case 4:
            System.out.println("I'M GOING FOR WATCH A MOVIE");
            break;

            case 5:
            System.out.println("I'M GOING FOR CLASSES");
            break;

            default:
            System.out.println("I DON'T WHICH DAY IS?");
        }
    }
}