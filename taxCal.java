import java.util.Scanner;

public class taxCal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        double salary =sc.nextDouble();
        double tax = 0;

        if(salary<=10000)
       {

           tax =0;
           System.out.println(" your total salary is : "+salary+"rs");

       } else if ((salary>10000)&&(salary<= 20000)) {
            tax += (0.1*salary);
            salary = salary - tax;
            System.out.println("your salary is : "+salary);
        }
        else if ((salary>20000)&&(salary<= 30000)) {
            tax += (0.15 * salary);
            salary = salary - tax;
            System.out.println("your salary is : " + salary);
        }
        else {
            tax = tax + (0.25*salary);
            salary = salary - tax ;
            System.out.println(" your salary is : "+ salary);
        }
    }
}
