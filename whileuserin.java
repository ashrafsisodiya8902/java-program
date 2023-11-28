import java.util.Scanner;

public class whileuserin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int i = sc.nextInt();

        System.out.print("Enter the last number: ");
        int j = sc.nextInt();

        while ( i <= j) {
            System.out.println(i);
            i++;
        }
    }
}
