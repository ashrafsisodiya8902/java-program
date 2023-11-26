import java.util.Scanner;

public class onenomax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();

        if (a > 10) {
            System.out.println("The num is greater then 10.");
        } else {
            System.out.println("The num is smaller then 10.");
        }
    }
}
    

