import java.util.Scanner;

public class aoc
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the radius of circle");
        int r = sc.nextInt();
        double area ;
        float pie = 3.14F;
        area = pie*r*r;
        System.out.println(" area of circle = "+area+"m2");
    }
}
