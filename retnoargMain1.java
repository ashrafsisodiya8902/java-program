import java.util.Scanner;
//return and no argument
public class retnoargMain1 {
    Scanner sc = new Scanner(System.in);

    int add() {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int c = a+b;

        return c;
    }

    int subt() {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int c =a-b;

        return c;
    }

    int mult() {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int c = a*b;

        return c;
    }

    int div() {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int c = a/b;

        return c;
    }

    int mod() {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int c = a%b;

        return c;
    }

    public static void main(String[] args) {
        retnoargMain1 k = new retnoargMain1();
        int add = k.add();
        System.out.println("Addition is " + add);

        int subt = k.subt();
        System.out.println("Subtraction is " + subt);

        int mult = k.mult();
        System.out.println("Multiplication is " + mult);

        int div = k.div();
        System.out.println("Division is " + div);

        int mod = k.mod();
        System.out.println("Modulus is " + mod);

    }
}