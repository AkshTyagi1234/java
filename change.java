import java.util.*;
public class change
{
	static void change(String k)
	{
		int i;
		StringBuffer y=new StringBuffer(k);
		for(i=0;i<y.length();i++)
		{
			if(Character.isUpperCase(y.charAt(i)))
			{
				y.setCharAt(i,Character.toLowerCase(y.charAt(i)));
			}
			else if(Character.isLowerCase(y.charAt(i)))
			{
				y.setCharAt(i,Character.toUpperCase(y.charAt(i)));
			}
		}
		System.out.println("After case coversion Word is:");
		System.out.println(y);
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Any Word");
		String word=new String();
		word=scanner.nextLine();
		change(word);
		
	}
}