import java.util.Scanner;

public class print10 {
    public static void main(String[] args) {
         Scanner Sc=new Scanner(System.in);
         System.out.println("Enter the size");
         int size =Sc.nextInt();
        
         for(int line=size;line>=1;line--){
             for(int space=1;space<line;space++){
                System.out.print(" ");
            }
            
            for(int star=1;star<=size;star++){
            System.out.print("*");
            }System.out.println();
         }

    }
    
}
