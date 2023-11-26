import java.util.Scanner;
public class UpperorLowercase{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = sc.next().charAt(0);			
		if(ch>='a' && ch<='z')
		{
			System.out.println("This is a Lowercase Alphabet");
		}
		else
		{
			System.out.println("This is a Uppercase Alphabet");
		}
	}
}