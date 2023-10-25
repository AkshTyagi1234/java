import java.util.Scanner;

public class print12 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size= Sc.nextInt();
        for(int line=1;line<=size;line++){
           for(int star=1;star<=line;star++){
            if(star==1 ||line==size || star==line){
               System.out.print("*");
            }
            else{
                System.out.print(" ");
           }
        }System.out.println();
        }
    }
}
