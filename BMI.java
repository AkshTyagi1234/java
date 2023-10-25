import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER YOUR WEIGHT IN KG ");
        double weight = sc.nextDouble();
        System.out.println(" ENTER YOUR HEIGHT IN METERS ");
        double height = sc.nextDouble();
        double BMI = weight/height;
        System.out.println(" YOUR BMI = "+BMI+"kg/m");;

    }

}
