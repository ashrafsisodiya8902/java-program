import java.util.Scanner;

public class twonomax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater then b.");
        } else {
            System.out.println("b is greater then a.");
        }
    }
}