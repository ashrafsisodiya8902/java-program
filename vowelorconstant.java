import java.util.Scanner;

public class vowelorconstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking value from user
        System.out.print("Enter the value: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("the character is a Vowel");
        } else {
            System.out.println("the character is a Consonent");
        }
    }
}