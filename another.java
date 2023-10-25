import java.util.Scanner;

public class another
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your basic salary ");
        double bs = sc.nextDouble();
       double hra = (30*bs)/100;
        System.out.println("");
       double ta = (20*bs)/100;
       double da = (10*bs)/100;
       double pf = 1500;
       double net_salary = bs+hra+ta+da-pf;
        System.out.println(" your net salary = "+net_salary+"rs");

    }
}
