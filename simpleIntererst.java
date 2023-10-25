import java.util.*;
class simpleInterest
{
    static void simprest(int p,int r,int t)
    {
        float si;
        si=(p*r*t)/100;
        System.out.println("Simple Interest is "+si+" .RS");
    }
    public static void main(String[] args){
        int p,r,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount: " );
        p=sc.nextInt();
        System.out.println("Enter the rate of interest");
        r=sc.nextInt();
        System.out.println("enter the time duration in years");
        t=sc.nextInt();
        simprest(p,r,t);
    }
}