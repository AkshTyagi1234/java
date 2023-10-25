import java.util.Scanner;

public class swapping
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first variable ");
        int a = sc.nextInt();
        System.out.println(" enter second variable ");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(" value of first "+a+" value of second "+b);

    }
}
