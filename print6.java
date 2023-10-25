import java.util.Scanner;

public class print6 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int size= Sc.nextInt();
        for(int line=1;line<=size;line++){
            for(int star=1;star<=size;star++){
                if(line==1 ||line==size || star==1|| star==size){
                System.out.print("*");
                }
               else{
                System.out.print(" ");
               }
               
            }System.out.println();
        }
    }
    
}
