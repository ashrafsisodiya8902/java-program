import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("the number is Positive");
        } else if (num < 0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("the number is Zero.");
        }
    }
}