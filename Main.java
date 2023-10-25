import java.sql.SQLOutput;
import java.util.Scanner;

class demo
{
    public static void main(String[] args) {
        System.out.println("HELLO ARYAN !!");
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println(" enter length of rectangle ");
        int length = sc.nextInt();
        System.out.println(" enter breadth of rectangle ");
        int breadth = sc.nextInt();
        int area ;
        area = length*breadth;
        System.out.println(area);
    }

}