import java.util.Scanner;

public class SEASONDET {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER ANY MONTH ");
        String month = sc.next().toUpperCase();
        switch (month)
        {
            case "DECEMBER","JANUARY","FEBRUARY":
            {
                System.out.println(" this is winter season ");
                break;
            }
            case "MARCH","APRIL","MAY":
            {
                System.out.println(" this is summer season ");
            }
            case "JUNE","JULY","AUGUST","SEPTEMBER":
            {
                System.out.println(" this is monsoon season ");
                break;
            }
            case "OCTOBER","NOVEMBER":
            {
                System.out.println(" this is autumn season ");
                break;
            }
            default:
                System.out.println(" OOPS ! INPUT IS INVALID ");
        }
    }
}
