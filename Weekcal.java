import java.util.Scanner;

public class Weekcal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any number between 1 to 7 ");
        int week = sc.nextInt();
        if(week==1)
        {
            System.out.println("MONDAY");
        } else if (week==2) {
            System.out.println("TUESDAY");
        } else if (week==3) {
            System.out.println("WEDNESDAY");
        } else if (week==4) {
            System.out.println("THURSDAY");
        } else if (week==5) {
            System.out.println("FRIDAY");
        } else if (week==6) {
            System.out.println("SATURDAY");
        } else if (week==7) {
            System.out.println("SUNDAY");
        }
        else{
            System.out.println("INVALID");
        }

    }
}
