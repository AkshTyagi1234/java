import java.util.Scanner;

public class voc
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any variable ");
        String x = sc.next();
        if((x=="a")||(x=="A")&&(x=="e")||(x=="E")&&(x=="i")||(x=="I")&&(x=="o")||(x=="O")&&(x=="u")||(x=="U"))
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }
    }
}
