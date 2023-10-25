import java.util.Scanner;

public class weekchecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the day ");
        String day = sc.next().toLowerCase();

        switch (day)
        {
            case "monday","tuesday","wednesday","thursday","friday":
            {
                System.out.println(" week day ");
            break;
            }
            case "saturday","sunday":
            {
                System.out.println("WEEKEND");
                break;
            }
            default:
            {
                System.out.println(" OOPS! you might have entered wrong input");
                break;
            }
        }

    }
}
