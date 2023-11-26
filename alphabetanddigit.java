import java.util.Scanner;

public class alphabetanddigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        char ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

       System.out.println("character is  alphabet");

        } else if(ch >= '0' && ch <= '8') {

      System.out.println("charcter is a digit");

        } else {

       System.out.println("invalid character");
        }
    
    }
}
