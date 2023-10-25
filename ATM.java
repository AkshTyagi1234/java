import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        System.out.println(" press 1 for check balance ");
        System.out.println(" press 2 for withdrawal money ");
        System.out.println(" press 3 for deposit money ");
        int x = sc.nextInt();
        while (true) {
            switch (x) {
                case 1: {
                    System.out.println(" your total amount is " + balance + "rs");
                    break;
                }
                case 2:
                {
                    System.out.println(" your balance is "+balance +"rs");
                    System.out.println(" enter how much money you want to withdrawal ");
                    int money = sc.nextInt();
                    if(balance>money)
                    {
                        balance = balance-money;
                        System.out.println(" now your balance amount : "+balance+"rs");
                    }
                    else {
                        System.out.println("oops you doesn't have sufficient balance ");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println(" enter the money you want to deposit ");
                    int dep = sc.nextInt();
                    balance= balance+dep;
                    System.out.println(" now your current balance is : "+ balance +"rs");
                    break;
                }
                default:{
                    System.out.println(" oops! something went wrong ");
                }
            }

        }
    }
}
