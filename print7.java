import java.util.Scanner;

public class print7 {
    public static void main(String[] args) {
         Scanner Sc=new Scanner(System.in);
         System.out.println("Enter the size");
         int size= Sc.nextInt();
         for(int line=1;line<=size;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }System.out.println(" ");
         }
    }
    
}
