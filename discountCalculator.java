import java.util.Scanner;

public class discountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the total bill ");
        double bill = sc.nextDouble();
        double discount;
        if(bill<1000)
        {
            discount = 0;
            System.out.println(" your last bill = "+bill+"rs");
        } else if ((bill<=1000)&&(bill<=5000)) {
            discount = 0.05*bill;
            bill = bill - discount;
            System.out.println(" your final bill = "+bill+"rs");
        }
        else if ((bill>5000)&&(bill<=10000)) {
            discount = 0.1*bill;
            bill = bill - discount;
            System.out.println(" your final bill = "+bill+"rs");
        }
        else if ((bill>10000)&&(bill<=20000)) {
            discount = 0.15*bill;
            bill = bill - discount;
            System.out.println(" your final bill = "+bill+"rs");
        }
        else {
            discount = 0.25*bill;
            bill = bill - discount;
            System.out.println(" your final bill = "+bill+"rs");
        }
    }
}
