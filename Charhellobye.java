import java.util.Scanner;

public class Charhellobye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a') {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }
    }
}