import java.util.Scanner;

public class print2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter student name and class");
        String name=Sc.next();
        int class_std=Sc.nextInt();

        name = "AKSH TYAGI";

        System.out.println("Name : " + name);
        System.out.println("Class : " + class_std);
        System.out.println("Enter Marks");
        //phy
        float phy=Sc.nextFloat();
        //bio
        float bio=Sc.nextFloat();
        //che
        float che=Sc.nextFloat();
        //math
        float math=Sc.nextFloat();
        //eng
        float eng=Sc.nextFloat();
        //total
        float total=phy+bio+che+math+eng;
        //result
        float result=(total/500)*100;  
        System.out.println("Result obtained is : " + result); 
     }
    
}
