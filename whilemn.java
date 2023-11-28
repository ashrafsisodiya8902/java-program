import java.util.Scanner;

public class whilemn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int m = sc.nextInt();

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i = 100;
        while (i >= 1) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
