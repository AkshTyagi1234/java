import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter students name ");
        String name = sc.next();
        System.out.println(" enter student's class ");
        String Standard = sc.next();
        System.out.println(" enter the marks of physics ");
        int phy = sc.nextInt();
        System.out.println(" enter the marks of Chemistry ");
        int chem = sc.nextInt();
        System.out.println(" enter the marks of biology ");
        int bio = sc.nextInt();
        System.out.println(" enter the marks of maths ");
        int math = sc.nextInt();
        System.out.println(" enter the marks of english ");
        int eng = sc.nextInt();
         double total = phy+chem+bio+math+eng;
        System.out.println(" your total marks "+total);
        double average = (phy+chem+bio+math+eng)/5;
        System.out.println(" your total percentage  = "+average+"%");

    }
}
