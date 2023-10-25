import java.util.Scanner;

public class print11 {
    public static void main(String[] args) {
          Scanner Sc=new Scanner(System.in);
         System.out.println("Enter the size");
         int size =Sc.nextInt();
        
         for(int line=size;line>=1;line--){
             for(int space=1;space<line;space++){
                System.out.print(" ");
            }
            
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
