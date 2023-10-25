import java.util.Scanner;

public class print3 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter weight and height");
        float weight=Sc.nextFloat();
        float height=Sc.nextFloat();
        float result=weight+(height*height);
        System.out.println("result obtain is"+result);
        

    }
    
}
