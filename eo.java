import java.util.Scanner;

public class eo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of variable ");
        int a= sc.nextInt();
        System.out.println((a%2==0)?" number is even ": " number is odd ");
    }
}
