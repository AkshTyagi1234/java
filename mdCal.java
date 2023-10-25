import java.util.Scanner;

public class mdCal
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.println(" enter first variable ");
        double a = sc.nextDouble();
        System.out.println(" enter second variable ");
        double b = sc.nextDouble();
        System.out.println(" press 1 for addition ");
        System.out.println(" press 2 for subtraction ");
        System.out.println(" press 3 for multiplication ");
        System.out.println(" press 4 for divison ");
        System.out.println(" press 5 for modulus ");
        int choice = sc.nextInt();
        double result = 0;
        switch (choice)
        {
            case 1:
            {
                result = a+b;
                System.out.println(" you've performed addition result : "+ result);


                break;
            }
            case 2:
            {
                result = a-b;
                System.out.println(" you've performed subtraction result : "+result);

                break;
            }
            case 3:
            {
                result = a*b;
                System.out.println(" you've performed multiplication result : "+result);

                break;
            }
            case 4:
            {
                result = a/b;
                System.out.println(" you've performed division result : "+result);

                break;
            }
            case 5:
            {
                result = a%b;
                System.out.println(" you've performed modulus result : "+result);

                break;
            }
            default:
            {
                System.out.println(" oops ! something went wrong ");
            }
        }
    }
}
