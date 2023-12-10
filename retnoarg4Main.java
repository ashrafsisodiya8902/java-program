import java.util.Scanner;
//return and no argument
public class retnoarg4Main {
    Scanner sc = new Scanner(System.in);

    String even() {
        System.out.println("Enter the number to verify if even: ");
        int num = sc.nextInt();
        String a = "EVEN";
        String b = "NOT EVEN";

        if (num % 2 == 0) {
            return a;
        } else {
            return b;
        }
    }

    String odd() {
        System.out.println("Enter the number to verify if odd: ");
        int num = sc.nextInt();
        String a = "ODD";
        String b = "NOT ODD";

        if (num % 2 != 0) {
            return a;
        } else {
            return b;
        }
    }

    int factorial() {
        System.out.println("Enter the number to find out it's facorial: ");
        int num = sc.nextInt();

        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        return fac;
    }

    String pallindrome() {
        System.out.print("Enter the number to check if pallindrome or not: ");
        int num = sc.nextInt();

        String a = "The Num is Pallindrome.";
        String b = "The Num is not Pallindrome.";

        int rev = 0, temp = num;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (num == rev) {
            return a;
        } else {
            return b;
        }
    }

    int fibanacci() {
        System.out.print("Enter the nth number: ");
        int num = sc.nextInt();

        int a = 0, b = 1, c = 0;

        for (int i = 1; i < num - 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    int reverse() {
        System.out.print("Enter the number you want to reverse: ");
        int num = sc.nextInt();

        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    int swap() {
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        return num1;
    }

    public static void main(String[] args) {
        retnoarg4Main a = new retnoarg4Main();

        String even = a.even();
        System.out.println(even);

        String odd = a.odd();
        System.out.println(odd);

        int fac = a.factorial();
        System.out.println(fac);

        String pall = a.pallindrome();
        System.out.println(pall);

        int fib = a.fibanacci();
        System.out.println(fib);

        int rev = a.reverse();
        System.out.println(rev);

        int swapped = a.swap();
        System.out.println(swapped);

    }
}