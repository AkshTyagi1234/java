import java.util.*;
public class areaperimeter {
    static void areaperimeter(int l,int b){
        int area,perimeter;
        area=l*b;
        System.out.println("Area is :"+area);
        perimeter=2*(l+b);
        System.out.println("Perimeter is:"+perimeter);
    }
    public static void main(String[] args){
        int l,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        b=sc.nextInt();
        areaperimeter(l,b);
    }
    
}
