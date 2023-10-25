import java.util.Scanner;

public class gat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of first number ");
        int a = sc.nextInt();
        System.out.println(" enter the value of second number ");
        int b = sc.nextInt();
        System.out.println(" enter the value of third number ");
        int c = sc.nextInt();
        System.out.println((a>b)?(a>c?"a":"c"):(b>c?"b":"c"));
    }
}