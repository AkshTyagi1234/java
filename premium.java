import java.util.*;        
    public class premium
    {
        static void premium(String name,String gender,int age,String city)
        {
            if((age>25&&age<35)&&(gender.equals("male"))&&(city.equals("metro")))
            {
                System.out.println("Premium is 6%");
            }
            else if((age>25&&age<40)&&(gender.equals("male"))&&(city.equals("not metro")))
            {
                System.out.print("Premium is 4%");
            }
            else if((age>25&&age<42)&&(gender.equals("female"))&&(city.equals("metro")))
            {
                System.out.println("Premium is 3%");
            }
            else if((age>25&&age<45)&&(gender.equals("female"))&&(city.equals("not metro")))
            {
                System.out.println("Premium is 2%");
            }
            else {
                System.out.print("NOT FOUND");
            }
        }
        public static void main(String args[]) 
        {
            Scanner scanner=new Scanner(System.in);
            String name,gender;
            int age;
            String city;
            System.out.println("Enter The Name Of The Person");
            name=scanner.nextLine();
            System.out.println("Enter The Gender Of '"+name+"'");
            gender=scanner.next();
            System.out.println("Enter The Age Of '"+name+"'");
            age=scanner.nextInt();
            System.out.println("Enter Metro city or Not True/False");
            city=scanner.next();
            premium(name, gender, age, city);
        }
    }

    
    

